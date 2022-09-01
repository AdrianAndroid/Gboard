package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.nio.channels.FileLockInterruptionException;

/* compiled from: PG */
/* renamed from: gbk  reason: default package */
/* loaded from: classes.dex */
public final class gbk {
    private static final jns a = jnl.a("FileLogger");
    private static final Object b = Build.ID;

    public static void a(Context context, mfx mfxVar) {
        FileOutputStream fileOutputStream;
        synchronized (b) {
            File file = new File(context.getExternalFilesDir(null).getAbsolutePath().replace(context.getPackageName(), context.getPackageName()), "brella_clearcut_log");
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (FileLockInterruptionException unused) {
                Thread.interrupted();
                a(context, mfxVar);
                Thread.currentThread().interrupt();
            } catch (IOException e) {
                a.e("Make sure you have READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions declared in your AndroidManifest.xml");
                throw new RuntimeException(e);
            }
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                FileLock lock = fileOutputStream.getChannel().lock();
                nfh t = jny.b.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                jny jnyVar = (jny) t.b;
                mfxVar.getClass();
                nga ngaVar = jnyVar.a;
                if (!ngaVar.c()) {
                    jnyVar.a = nfm.H(ngaVar);
                }
                jnyVar.a.add(mfxVar);
                ((jny) t.cz()).p(dataOutputStream);
                dataOutputStream.flush();
                file.getAbsolutePath();
                if (lock != null) {
                    lock.close();
                }
                dataOutputStream.close();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
    }
}
