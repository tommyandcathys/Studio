package com.smithware.studiolive;


import java.util.ArrayList;

import com.codename1.io.Log;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.list.MultiList;
import com.codename1.ui.Display;
import com.codename1.ui.Form;


import userclasses.StateMachine;

public class StudioLive {
   
    private Form current;
private ArrayList<verse> Verses;
    public void init(Object context) {
        // Pro users - uncomment this code to get crash reports sent to you automatically
        /*Display.getInstance().addEdtErrorHandler(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                evt.consume();
                Log.p("Exception in AppName version " + Display.getInstance().getProperty("AppVersion", "Unknown"));
                Log.p("OS " + Display.getInstance().getPlatformName());
                Log.p("Error " + evt.getSource());
                Log.p("Current Form " + Display.getInstance().getCurrent().getName());
                Log.e((Throwable)evt.getSource());
                Log.sendLog();
            }
        });*/
    	Verses = new ArrayList<verse>();
    	Verses.add(new verse("1 Corinthians 13:4a", "Love is Patient.  Love is Kind"));
    	Verses.add(new verse("Genesis 1:27", "So God created human beings in his own likeness.  He created them to be like Himself.  He created them as male and female."));
    	Verses.add(new verse("Roman's 3:23", "Everyone has sinned.  No one measures up to God's glory."));
    	Verses.add(new verse("Romans 5:8", "But here is how God has shown his love for us, while we were still sinners Christ died for us."));
    	Verses.add(new verse("John 14:6", "Jesus answered, 'I am the way and the truth and the life.  No one comes to the Father except through me.'"));
    	
    
    }

    public void start() {
        if(current != null){
            current.show();
            return;
        }
        new StateMachine("/theme");        
        
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }
    
    public void destroy() {
    }
}
