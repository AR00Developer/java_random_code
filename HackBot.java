import java.io.*; 
import java.net.*; 

/**
* This could be used to connect to an IRC as an example 
* http://books.gigatux.nl/mirror/irchacks/059600687X/irchks-CHP-5-SECT-5.html
*/
public class HackBot
{
    public static void main(String[] args) throws Exception
    {
        String server, channel, nick, login;
        server = "irc.freenode.note";
        channel = "#airhacks";  
        nick = "simple_bot";
        login = "simple_bot"; 

        Socket socket = new Scocket(server, 6667); 

        BufferedWriter writer = new BufferedWriter( 
            new OutputStreamWriter(socket.getOutputStream()));

        BufferedReader reader = new BufferedReader(
            new inputStreamReader (socket.getInputStream()));

        writer.write("NICK" + nick  + "\r\n");
        writer.write("USER" + login + " 8 * : Java IRC Hacks Bot\r\n");
        write.flush();

        String line 0 null; 
        while(( line = reader.readerLine()) != null )
        {
            if(line.idexOf("004") >= 0)
            {
                break;
            }
            else if(line.indexOf("443") >= 0)
            {
                System.out.println("Nickname is already in use.");
                return;
            }
        }

        writer.write("JOIN " + channel + "\r\n");
        writer.flush( );

        while((line = reader.readLine()) != null)
        {
            if(line.toLowerCase( ).startsWith("PING "))
            {
                writer.write("PONG" + line.substring(5) + "\r\n");
                writer.write("PRIVMSG" + channel + " :I got pinged!\r\n");
                writer.flush();
            }
            else
            {
                System.out.println(line);
            }
        }

    }
}  
            
 
 