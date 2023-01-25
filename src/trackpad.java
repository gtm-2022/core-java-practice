import java.awt.*;
import java.awt.event.*;
import java.io.*;



//---------------------------------------
 class Myframe01 extends Frame  { //creating class name is 'Myframe' extending from 'Frame' class 
    MenuBar bar;   
    Menu menu1,menu2,format_menu,font_size,theme;
    MenuItem new_item1,item2,item3,item4,item5,item6,item7,item8;
    MenuItem dracula,queen,dawn,light;
    MenuItem size_8,size_10,size_12,size_14,size_16,size_20,size_24,size_28,size_50;

    TextArea textArea;
    String text;
  
   
     Myframe01(){

        setTitle("Untitled - Trackpad");
       
//this is for shortcut keys
            MenuShortcut menuShortcut_new_item1 = new MenuShortcut(KeyEvent.VK_N);
            MenuShortcut menuShortcut_item2 = new MenuShortcut(KeyEvent.VK_O);
            MenuShortcut menuShortcut_item3 = new MenuShortcut(KeyEvent.VK_S);
            MenuShortcut menuShortcut_item4 = new MenuShortcut(KeyEvent.VK_X);

            MenuShortcut menuShortcut_item5 = new MenuShortcut(KeyEvent.VK_C);
            MenuShortcut menuShortcut_item6 = new MenuShortcut(KeyEvent.VK_V);
            MenuShortcut menuShortcut_item7 = new MenuShortcut(KeyEvent.VK_T);
            MenuShortcut menuShortcut_item8 = new MenuShortcut(KeyEvent.VK_A);
// -------------------------------------------
// setting icon
        Image icon= Toolkit.getDefaultToolkit().getImage(".//res//icon.png");
        setIconImage(icon);



            
            bar = new MenuBar();  //creating object of menubar and giving it reference

            menu1 = new Menu("File");//creating object of menu as 'File' and giving it reference
            menu2 = new Menu("Edit");//creating object of menu as 'Edit' and giving it reference
            
            format_menu=new Menu("Format");//creating object of menu as 'Format' and giving it reference
            font_size=new Menu("Font Size");//creating object of menu as 'Font Size' and giving it reference
            theme = new Menu("Theme");//creating object of menu as 'Theme' and giving it reference
          
            
//creating object of MenuItem  and giving it reference,and Passing arguments 'label','menushortcut'
            new_item1 =new MenuItem("New",menuShortcut_new_item1);
            item2 =new MenuItem("Open",menuShortcut_item2);
            item3 =new MenuItem("Save",menuShortcut_item3);
            item4 =new MenuItem("Exit",menuShortcut_item4);

            item5 =new MenuItem("Copy",menuShortcut_item5);
            item6 =new MenuItem("Paste",menuShortcut_item6);
            item7 =new MenuItem("Cut",menuShortcut_item7);
            item8 =new MenuItem("Select All",menuShortcut_item8);

// ------------------done--------------

// creating menuItem for font size menu
            size_8 =new MenuItem("8");
            size_10=new MenuItem("10");
            size_12 =new MenuItem("12");
            size_14 =new MenuItem("14");
            size_16=new MenuItem("16");
            size_20=new MenuItem("20");
            size_24=new MenuItem("24");
            size_28=new MenuItem("28");
            size_50=new MenuItem("50");
// -------------------done-------------------
// creating menuItem for theme menu
            dracula=new MenuItem("Dracula");
            queen=new MenuItem("Queen");
            dawn=new MenuItem("Dawn");
            light=new MenuItem("Light");

// creating menuItem for theme menu


// adding new_item1,2,3,4 to menu1 ,that is new,open,save,exit
             menu1.add(new_item1);
            menu1.add(item2);
            menu1.add(item3);
            menu1.add(item4);
        
// ------------------Done-------------------

//  adding item5,6,7,8 to menu2 ,that is copy,paste,cut,and select all
            menu2.add(item5);
            menu2.add(item6);
            menu2.add(item7);
            menu2.add(item8);
// -------done---------------------------------------------------------
       
 
           format_menu.add(font_size);//adding font_size menu to format menu so it becomes submenu

// adding MenuItems to font_size menu
           font_size.add(size_8);
           font_size.add(size_10);
           font_size.add(size_12);
           font_size.add(size_14);
           font_size.add(size_16);
           font_size.add(size_20);
           font_size.add(size_24);
           font_size.add(size_28);
           font_size.add(size_50);
// ---------done------------------------

// adding MenuItem to theme Menu-------
           theme.add(dracula);
           theme.add(queen);
           theme.add(dawn);
           theme.add(light);
// ---------done------------------------           

            textArea= new TextArea();//adding textarea
            // adding menus to bar
            bar.add(menu1);
            bar.add(menu2);
            bar.add(format_menu);
            bar.add(theme);

            setMenuBar(bar);            //settingmenubar as bar
            add(textArea);//adding text area

            // declaring some colors using rgb
            
            Color dracula_Color = new Color(39,40,34);
            Color green_Color = new Color(166,226,41);
            Color orange_Color = new Color(219,84,34);
            Color queen_Color = new Color(174,129,219);
            

            // setting default foreground color of textArea and setting font
            textArea.setForeground(Color.BLACK);
            textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
            
            

    //setting size and location and visibility
            setSize(1000,600);
            setLocationRelativeTo(null);
            setVisible(true);
        
     
      

        item2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                FileDialog dialog = new FileDialog(new Frame(),"Open",FileDialog.LOAD); //this will load  the fileDialog
                dialog.setVisible(true);//this will make dialog visible
                String path = dialog.getDirectory()+dialog.getFile(); //this will select the path of selected file and put it into 'path'
                setTitle(dialog.getFile()+" - CodePad");//this will set Title to selected file name and -CodePad
                
                try {
                    FileInputStream fi = new FileInputStream(path); 
                    byte b[]=new byte[fi.available()];
                    fi.read(b);
                    String str = new String(b); //this will store b in str
                    textArea.setText(str);//this will display text in 'str' in textarea
                    fi.close();//this will close fi
                    
                } catch (Exception e) {
                    
                    System.out.println("Something went Wrong :(");
                }
            }
        });

    new_item1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event) {
            setTitle("Untitled - CodePad");
            textArea.setText(" ");
        }
    });

        item3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                FileDialog dialog = new FileDialog(new Frame(),"Save ",FileDialog.SAVE);
                dialog.setVisible(true);
                String path = dialog.getDirectory()+dialog.getFile();
                setTitle(dialog.getFile()+"- CodePad");
                
                try {

                 FileWriter fw = new FileWriter(path);
                    fw.write(textArea.getText());
                    fw.close();
                  
                    
                } catch (Exception e) {
                    
                    System.out.println("Something went Wrong :(");
                }
            }
        });
        item4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
            //    setVisible(false);//this will make frame invisible
            System.exit(0);
            }
        });

  
      
        item5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                    text = textArea.getSelectedText();//this will store selected text in to variable 'text'
            }
        });

  
      
        item6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                   textArea.insert(text,textArea.getCaretPosition()); //this will insert the text present in 'text' variable at the carret position
            }
        });

  
      
        item7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                text = textArea.getSelectedText(); //this will copy the selected text
                textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd()); //this will put "" to selected text
            }
        });
      
        item8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.selectAll();  //this will select all the text in textarea
            }
        });

      
 // ------------------------------------------------------------------------
 
// --------------------------------------------------------------------------
        
        size_8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD,8)); //this will change the size of text in textarea to 8
            }
        });
        size_12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));//this will change the size of text in textarea to 12
            }
        });
        size_16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD,16));//this will change the size of text in textarea to 16
            }
        });
        size_20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD,20));//this will change the size of text in textarea to 20
            }
        });
        size_24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD,24));//this will change the size of text in textarea to 24
            }
        });
        size_28.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD,28));//this will change the size of text in textarea to 28
            }
        });


// -------------------------------------------------------------------------- 
        dracula.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
               
                textArea.setBackground(dracula_Color);//this will backgound to dracula
                textArea.setForeground(green_Color);//this will set foregrounf to green
            }
        });
        queen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){

                textArea.setBackground(dracula_Color);
                textArea.setForeground(queen_Color);
            }
        });
        dawn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setBackground(Color.WHITE);
                textArea.setForeground(orange_Color);
            }
        });
        light.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setBackground(Color.WHITE);
                textArea.setForeground(Color.BLUE);
            }
        });
        
// -------------------------------------------------------------------------- 
  

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent event){
                // setVisible(false);    //this will set visibility of frame to false ,so the frame become invisible
                System.exit(0);
            }
        });         
    }

 
}


//---------------------------------------

public class trackpad{
    public static void main(String[] args) {
        new Myframe01();//object
    }
}