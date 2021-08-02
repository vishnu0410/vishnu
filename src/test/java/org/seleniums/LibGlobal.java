package org.seleniums;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static  WebDriver driver;
	public WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\java Files\\Java Programming\\mavenProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public void launchurl(String url)
	{
		driver.get(url);
	}
	public void enterText(WebElement ele,String text) {
		ele.sendKeys(text);
	}
	public void btnclick(WebElement element)
	{
		element.click();
	}
	public void clear(WebElement ele) {
		ele.clear();
	}
	public void quit() {
	driver.quit();	
	}
	public void close() {
		driver.close();
	}
	public void getText(WebElement element,String text) {
		element.getText();
	}
	public void getAttribute(WebElement element,String txt) {
		String id =element.getAttribute(txt);
		System.out.println(id);
	}
	public void getAttributeId(WebElement element,String text) {
		String attribute = element.getAttribute(text);
		System.out.println(attribute);
	}
	public void title(String title) {
		driver.getTitle();
	}
	public void currenturl(String url) {
		driver.getCurrentUrl();
	}
	public void navigate(String url) {
		driver.navigate().to(url);
	}
	public void navigateback() {
		driver.navigate().back();
	}
	public void navigateforward() {
		driver.navigate().forward();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	public void mouseActions(WebElement moves) {
		Actions acc = new Actions(driver);
		acc.moveToElement(moves).perform();
	}
	public void dropDown(WebElement src,WebElement dest) {
		Actions acc = new Actions(driver);
		acc.dragAndDrop(src, dest);
	}
	public void rightClick(WebElement clicks) {
		Actions acc = new Actions(driver);
		acc.contextClick(clicks).perform();
	}
	public void doubleClick(WebElement clicking) {
		Actions acc = new Actions(driver);
		acc.doubleClick().perform();
	}
	public void dismiss() {
		driver.switchTo().alert().dismiss();
	}
	public void accept() {
		driver.switchTo().alert().accept();
	}
	public void sendText(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	public void StringGetText(String text) {
		driver.switchTo().alert().getText();
	}
	public void dropDownValue(WebElement element,String value) {
		Select s= new Select(element);
		s.selectByValue(value);
	}
	public void dropDownText(WebElement element,String name) {
		Select s= new Select(element);
		s.selectByVisibleText(name);
	}
	public void dropDownIndex(WebElement element,int values) {
		Select s= new Select(element);
		s.selectByIndex(values);
	}
	public void deSelectByIndex(WebElement element,int value) {
		Select s=new Select(element);
		s.deselectByIndex(value);
	}
	public void deSelectByValue(WebElement element, String value) { 
		Select s = new Select(element);
		s.deselectByValue(value);
	}
	public void deSelectByVisible(WebElement element,String name) {
		Select s = new Select(element);
		s.deselectByVisibleText(name);
	}
	public void deSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}
	public void getAllOptions(WebElement element,int value) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		System.out.println(options.get(value));
	}
	public void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	public void enterTextByJavaScript(WebElement element,String data) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
	}
	public void getTextByJs(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
		System.out.println(executeScript);
	}
	public void clickByJs(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	public void ScroolIntoTrueByJs() {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scroolIntoViwe(true)");
	}
	public void ScroolIntoViewFalseJs() {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scroolIntoView(false)");
	}
	public void takeScreenShot(String name) throws IOException
	{
	TakesScreenshot tk=(TakesScreenshot) driver;
	File screenShootAs=tk.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenShootAs, new File(name+".png"));
	}
    public void switchToFrames(WebElement element) {
		driver.switchTo().frame(element);
	}
    public void frameById(int id) {
		driver.switchTo().frame(id);
	}
    public void frameByName(String name) {
		driver.switchTo().frame(name);
	}
    public void frameParent() {
	driver.switchTo().parentFrame();
	}
    public void frameContent() {
    	driver.switchTo().defaultContent();
	}
    public void windowHandleByUrl(String url) {
	   driver.switchTo().window(url);
}
    public void windowHandleByTitle(String title) {
    	driver.switchTo().window(title);
	}
    public String getDataFromExcel(String pathname,String sheetname,int rowNo, int cellNo) throws IOException
    {
    	File file =new File(pathname);
    	FileInputStream stream =new FileInputStream(file);
    	Workbook book = new XSSFWorkbook(stream);
    	 Sheet sheet =book.getSheet(sheetname);
    	 Row row =sheet.getRow(rowNo);
    	 Cell cell=row.getCell(cellNo);
    	int ct= cell.getCellType();
    	String value ="";
    	if(ct==1)
    	{
    		value=cell.getStringCellValue();
    	} 
    	else if(DateUtil.isCellDateFormatted(cell))
    	{
    		Date cellvalue=cell.getDateCellValue();
    		SimpleDateFormat dateFormat =new SimpleDateFormat("dd-mm-yyyy");
    		value=dateFormat.format(cellvalue);
    	}
    	else
    	{
    		double numericalCell = cell.getNumericCellValue();
    		long l =(long) numericalCell;
    		value =String.valueOf(l);
    	}
    		
		return value;
    	
    }
    
}

