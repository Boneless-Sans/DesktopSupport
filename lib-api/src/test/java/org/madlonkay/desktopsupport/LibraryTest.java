/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.madlonkay.desktopsupport;

import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.Window;

import javax.swing.JMenuBar;

import org.junit.Test;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        new IDesktopSupport() {

            @Override
            public void addAppEventListener(SystemEventListener listener) {
                // TODO Auto-generated method stub

            }

            @Override
            public void removeAppEventListener(SystemEventListener listener) {
                // TODO Auto-generated method stub

            }

            @Override
            public void setAboutHandler(AboutHandler handler) {
                // TODO Auto-generated method stub

            }

            @Override
            public void setPreferencesHandler(PreferencesHandler handler) {
                // TODO Auto-generated method stub

            }

            @Override
            public void setOpenFilesHandler(OpenFilesHandler handler) {
                // TODO Auto-generated method stub

            }

            @Override
            public void setPrintFilesHandler(PrintFilesHandler handler) {
                // TODO Auto-generated method stub

            }

            @Override
            public void setOpenURIHandler(OpenURIHandler handler) {
                // TODO Auto-generated method stub

            }

            @Override
            public void setQuitHandler(QuitHandler handler) {
                // TODO Auto-generated method stub

            }

            @Override
            public void setQuitStrategy(QuitStrategy strategy) {
                // TODO Auto-generated method stub

            }

            @Override
            public void enableSuddenTermination() {
                // TODO Auto-generated method stub

            }

            @Override
            public void disableSuddenTermination() {
                // TODO Auto-generated method stub

            }

            @Override
            public void requestForeground(boolean allWindows) {
                // TODO Auto-generated method stub

            }

            @Override
            public void openHelpViewer() {
                // TODO Auto-generated method stub

            }

            @Override
            public void setDefaultMenuBar(JMenuBar menuBar) {
                // TODO Auto-generated method stub

            }

            @Override
            public Image getDockIconImage() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public void setDockIconImage(Image image) {
                // TODO Auto-generated method stub

            }

            @Override
            public void setDockIconBadge(String badge) {
                // TODO Auto-generated method stub

            }

            @Override
            public PopupMenu getDockMenu() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public void setDockMenu(PopupMenu menu) {
                // TODO Auto-generated method stub

            }

            @Override
            public void requestUserAttention(boolean critical) {
                // TODO Auto-generated method stub

            }

            @Override
            public void requestToggleFullScreen(Window window) {
                // TODO Auto-generated method stub

            }

            @Override
            public void setWindowCanFullScreen(Window window, boolean enabled) {
                // TODO Auto-generated method stub

            }

            @Override
            public void addFullScreenListenerTo(Window window, FullScreenListener listener) {
                // TODO Auto-generated method stub

            }

            @Override
            public void removeFullScreenListenerFrom(Window window, FullScreenListener listener) {
                // TODO Auto-generated method stub

            }

        };
    }
}
