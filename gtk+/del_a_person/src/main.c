#include <gtk/gtk.h>

GtkWidget *g_lbl_text;
GtkWidget *g_lbl_count;


int main(int argc, char *argv[])
{
    GtkBuilder      *builder; 
    GtkWidget       *window;

    gtk_init(&argc, &argv);

    //builder = gtk_builder_new();
    //gtk_builder_add_from_file (builder, "glade/window_main.glade", NULL);
    builder = gtk_builder_new_from_file("glade/window_main.glade");

    window = GTK_WIDGET(gtk_builder_get_object(builder, "window_main"));
    gtk_builder_connect_signals(builder, NULL);
    
    // get pointers to the two labels
    g_lbl_text = GTK_WIDGET(gtk_builder_get_object(builder, "lbl_text"));

    g_object_unref(builder);

    gtk_widget_show(window);                
    gtk_main();

    return 0;
}

// called when button is clicked
void on_btn_delete_clicked(GtkButton *btn_delete, GtkEntry *entry)
{
    const gchar *name;

    name = gtk_entry_get_text(entry);

    printf("%s is already dead inside. \n",name);
    

}

// called when window is closed
void on_window_main_destroy()
{
    gtk_main_quit();
}