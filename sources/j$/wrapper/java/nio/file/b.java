package j$.wrapper.java.nio.file;

import android.os.Build;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.NotLinkException;

/* loaded from: classes3.dex */
public abstract class b {
    public static IOException a(IOException iOException) {
        IOException fVar;
        if (iOException == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (iOException instanceof AccessDeniedException) {
                fVar = new a((AccessDeniedException) iOException);
            } else if (iOException instanceof AtomicMoveNotSupportedException) {
                fVar = new c((AtomicMoveNotSupportedException) iOException);
            } else if (iOException instanceof DirectoryNotEmptyException) {
                fVar = new d((DirectoryNotEmptyException) iOException);
            } else if (iOException instanceof FileAlreadyExistsException) {
                fVar = new e((FileAlreadyExistsException) iOException);
            } else if (iOException instanceof FileSystemLoopException) {
                fVar = new g((FileSystemLoopException) iOException);
            } else if (iOException instanceof NoSuchFileException) {
                fVar = new h((NoSuchFileException) iOException);
            } else if (iOException instanceof NotDirectoryException) {
                fVar = new i((NotDirectoryException) iOException);
            } else if (iOException instanceof NotLinkException) {
                fVar = new j((NotLinkException) iOException);
            } else if (iOException instanceof FileSystemException) {
                fVar = new f((FileSystemException) iOException);
            } else {
                return iOException;
            }
            return fVar;
        }
        return iOException;
    }
}
