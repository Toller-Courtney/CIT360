package cit360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

/* In this demonstration I am connecting to the internet and
 * reading in the HTML from the BYUI website using an 
 * HTTPURLconnection.*/
public class HTTPURLConnection {

	public static void main(String[] args) throws Exception {

		try {
			/*
			 * Here we are creating a new URL connection object and storing the url to
			 * access the byui website. this will be used later to open our connection
			 */
			URL byui = new URL("http://www.byui.edu");

			/*
			 * Here we are opening the internet connections to the website.
			 */
			HttpURLConnection byuiConnection = (HttpURLConnection) byui.openConnection();

			/*
			 * We are creating a buffer reader to read in our url object. This is
			 * implementing the connection that we established above.
			 */
			BufferedReader input = new BufferedReader(new InputStreamReader(byuiConnection.getInputStream()));

			/*
			 * we are creating this string to read the url in from the buffer. This will be
			 * used in our while loop
			 */
			String byuiInput;

			/*
			 * Here we create a while loop to read in the information from the buffer and
			 * print it out to our console. This is saying that as long as there in input to
			 * read in, the loop will continue to print to the console.
			 */
			while ((byuiInput = input.readLine()) != null)
				System.out.println(byuiInput);

			/*
			 * Here we are closing our connection after all the information from the URL has
			 * been brought in, signaling to the program that the session has ended.
			 */
			input.close();
			/*
			 * Here we are establishing a catch exception.If there an error when trying to
			 * connect, this will catch that exception and outprint the excpetion message
			 */
		} catch (ConnectException e) {
			System.out.println(e);

			/*
			 * Here we are catching any sort of Input and Output error that my occur when
			 * the program runs.
			 */
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
