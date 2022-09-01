package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gwk  reason: default package */
/* loaded from: classes.dex */
public final class gwk {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/cache/FileCache");
    public final HashMap b = new HashMap();
    public final gwl c;
    public final gwj d;

    public gwk(gwj gwjVar, gwl gwlVar) {
        this.d = gwjVar;
        this.c = gwlVar;
    }

    private final void e(String str, mko mkoVar, Executor executor) {
        kcu.U(mkoVar, new hiy(this, str, mkoVar, 1), executor);
    }

    public final synchronized mko a(String str, mkr mkrVar) {
        mko mkoVar = (mko) this.b.get(str);
        if (mkoVar != null) {
            return kcu.L(mkoVar);
        }
        mko hQ = mkrVar.hQ(new gnq(this, str, 2));
        this.b.put(str, hQ);
        e(str, hQ, mkrVar);
        return kcu.L(hQ);
    }

    public final Object b(String str, Object obj) {
        File file = this.d.b;
        if (file.exists() || jan.b.h(file)) {
            File file2 = new File(this.d.b, str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                this.c.b(fileOutputStream, obj);
                fileOutputStream.close();
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    int length = (int) randomAccessFile.length();
                    randomAccessFile.seek(length);
                    randomAccessFile.writeInt(length);
                    randomAccessFile.close();
                    return obj;
                } catch (IOException unused) {
                    return null;
                }
            } catch (FileNotFoundException unused2) {
                return null;
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/cache/FileCache", "putInternal", 159, "FileCache.java")).w("Error writing file: %s", file2);
                return null;
            }
        }
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.c()).k("com/google/android/libraries/inputmethod/cache/FileCache", "createFolderIfAbsent", 216, "FileCache.java")).w("Failed to create directory: %s", file);
        ((ltd) ((ltd) ltgVar.c()).k("com/google/android/libraries/inputmethod/cache/FileCache", "putInternal", 149, "FileCache.java")).w("Failed to create folder for file: %s", str);
        return null;
    }

    public final synchronized boolean c() {
        if (!jan.b.e(this.d.b)) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/cache/FileCache", "clearAllInternal", 250, "FileCache.java")).w("Failed to delete files in: %s", this.d.b);
            return false;
        }
        return true;
    }

    public final synchronized void d(String str, Object obj, mkr mkrVar) {
        mko hQ;
        mko mkoVar = (mko) this.b.get(str);
        if (mkoVar != null) {
            hQ = mio.g(mkoVar, new crj(this, str, obj, 8), mkrVar);
        } else {
            hQ = mkrVar.hQ(new cak(this, str, obj, 11));
        }
        this.b.put(str, hQ);
        e(str, hQ, mkrVar);
        kcu.L(hQ);
    }
}
