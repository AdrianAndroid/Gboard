package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;
import java.io.File;

/* compiled from: PG */
/* renamed from: dio  reason: default package */
/* loaded from: classes.dex */
public final class dio implements AutoCloseable {
    private static final lug b = hin.a;
    public final MutableDictionaryAccessorInterfaceImpl a;
    private final dij c;
    private final int d;

    public dio(dij dijVar, int i) {
        this.d = i;
        this.c = dijVar;
        this.a = dijVar.M(i);
    }

    public final boolean a() {
        MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl = this.a;
        if (mutableDictionaryAccessorInterfaceImpl == null) {
            return false;
        }
        return mutableDictionaryAccessorInterfaceImpl.nativeNewEmptyDictionary(mutableDictionaryAccessorInterfaceImpl.a);
    }

    public final boolean b() {
        String H;
        if (this.a == null || (H = this.c.H(this.d)) == null) {
            return false;
        }
        Context a = guw.a();
        File fileStreamPath = a.getFileStreamPath(H);
        File fileStreamPath2 = a.getFileStreamPath(String.format("%s_bak", H));
        File fileStreamPath3 = a.getFileStreamPath(String.format("%s_tmp", H));
        MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl = this.a;
        if (mutableDictionaryAccessorInterfaceImpl.nativeGetDictionarySize(mutableDictionaryAccessorInterfaceImpl.a) == 0) {
            fileStreamPath.delete();
        }
        if (fileStreamPath3.exists() && !fileStreamPath3.delete()) {
            ((luc) ((luc) b.c()).k("com/google/android/apps/inputmethod/libs/hmm/DictionaryAccessor", "persist", 190, "DictionaryAccessor.java")).w("error deleting file: %s", fileStreamPath3.getAbsolutePath());
            return false;
        }
        try {
            MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl2 = this.a;
            if (!mutableDictionaryAccessorInterfaceImpl2.nativePersist(mutableDictionaryAccessorInterfaceImpl2.a, fileStreamPath3.getAbsolutePath())) {
                if (fileStreamPath3.exists()) {
                    fileStreamPath3.delete();
                }
                if (fileStreamPath2.exists() && !fileStreamPath.exists()) {
                    fileStreamPath2.renameTo(fileStreamPath);
                }
                return false;
            }
            if (fileStreamPath.exists()) {
                if (fileStreamPath2.exists() && !fileStreamPath2.delete()) {
                    ((luc) ((luc) b.c()).k("com/google/android/apps/inputmethod/libs/hmm/DictionaryAccessor", "persist", 199, "DictionaryAccessor.java")).w("error deleting file: %s", fileStreamPath2.getAbsolutePath());
                    if (fileStreamPath3.exists()) {
                        fileStreamPath3.delete();
                    }
                    if (fileStreamPath2.exists() && !fileStreamPath.exists()) {
                        fileStreamPath2.renameTo(fileStreamPath);
                    }
                    return false;
                } else if (!fileStreamPath.renameTo(fileStreamPath2)) {
                    ((luc) ((luc) b.c()).k("com/google/android/apps/inputmethod/libs/hmm/DictionaryAccessor", "persist", 203, "DictionaryAccessor.java")).G("error renaming file: %s to file:%s", fileStreamPath.getPath(), fileStreamPath2.getPath());
                    if (fileStreamPath3.exists()) {
                        fileStreamPath3.delete();
                    }
                    if (fileStreamPath2.exists() && !fileStreamPath.exists()) {
                        fileStreamPath2.renameTo(fileStreamPath);
                    }
                    return false;
                }
            }
            if (!fileStreamPath3.renameTo(fileStreamPath)) {
                ((luc) ((luc) b.c()).k("com/google/android/apps/inputmethod/libs/hmm/DictionaryAccessor", "persist", 210, "DictionaryAccessor.java")).G("error renaming file: %s to file:%s", fileStreamPath3.getPath(), fileStreamPath.getPath());
                if (fileStreamPath3.exists()) {
                    fileStreamPath3.delete();
                }
                if (fileStreamPath2.exists() && !fileStreamPath.exists()) {
                    fileStreamPath2.renameTo(fileStreamPath);
                }
                return false;
            }
            if (!fileStreamPath2.delete()) {
                ((luc) ((luc) b.c()).k("com/google/android/apps/inputmethod/libs/hmm/DictionaryAccessor", "persist", 216, "DictionaryAccessor.java")).w("error deleting file: %s", fileStreamPath2.getAbsolutePath());
            }
            if (fileStreamPath3.exists()) {
                fileStreamPath3.delete();
            }
            if (fileStreamPath2.exists() && !fileStreamPath.exists()) {
                fileStreamPath2.renameTo(fileStreamPath);
            }
            return true;
        } catch (Throwable th) {
            if (fileStreamPath3.exists()) {
                fileStreamPath3.delete();
            }
            if (fileStreamPath2.exists() && !fileStreamPath.exists()) {
                fileStreamPath2.renameTo(fileStreamPath);
            }
            throw th;
        }
    }

    public final void c(String str, int i) {
        MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl = this.a;
        if (mutableDictionaryAccessorInterfaceImpl == null) {
            return;
        }
        mutableDictionaryAccessorInterfaceImpl.nativeInsertOrUpdate(mutableDictionaryAccessorInterfaceImpl.a, str, i, false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        gvt.a(this.a);
    }
}
