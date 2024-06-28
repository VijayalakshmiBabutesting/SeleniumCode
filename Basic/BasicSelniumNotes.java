package Basic;

public class BasicSelniumNotes {
	
	/*Create the webelement & create a action (using driver)
	 * Find element Element = return type Webelement
	 * locotor return type =by
	 * // driver,findelement is webelement
	 * creating a webelement using driver.find element
	 *  With the help of driver refrence name ,actioning all webelemet
	 *  Two way of link
	 * 1 ) link text  tag name should be<a>
	 * 2)Button
	 * in web page each textbox,image, text, drop down we called as webelement
	 *Thread.sleep is like it wait element to load. till that element is visiable
	 *it will wait more then 10 second even though element is available
	 *Thread.sleep =static
	 * 
	 * 
	 * --------------------Stale Element Exception------------------------------
	 * 1)Enter the value in textbox
	 * 2)then refresh
	 * 3) then again enter the value from textbox
	 * 
	 * Outupt: we received stale element exception( element is not available in DOM)
	 * 
	 * Reason: first time enter the value that one is v1 version
	 *         after refresh u will received v2 version
	 *         
	 *  Home to resolved: we need to inspect , mention the webelemnt using locoators
	 *       // Element is not attached to the page document  
	 * 
	   //create a browser utilti to mention the webdriver & driver
	    * webdriver & driver is same  for overall webelement utiltil
	    * how to make webdriver & driver i all the web element page with the help of constructor
	    * webdriver &  driver interact the webelemnt in overall page  with the help constructor
	 * in element utili to call the webdriver & driver in browser util with the help of constructor
	 * 
	 * when the constructor will call?
	 * 
	 * Ans constructor will be call when we create the object of the class
	 * 
	 * 
	 */

}
