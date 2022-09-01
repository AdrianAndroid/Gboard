package defpackage;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jmt  reason: default package */
/* loaded from: classes.dex */
public final class jmt {
    public static Uri a(Context context, Uri uri) {
        try {
            String readlink = Os.readlink(kqn.h(uri, context).getAbsolutePath());
            if (readlink == null) {
                throw new IOException("Unable to read symlink");
            }
            kor a = kos.a(context);
            a.b(readlink);
            return a.a();
        } catch (ErrnoException | koy e) {
            throw new IOException("Unable to read symlink", e);
        }
    }

    public static void b(Context context, Uri uri, Uri uri2) {
        try {
            Os.symlink(kqn.h(uri2, context).getAbsolutePath(), kqn.h(uri, context).getAbsolutePath());
        } catch (ErrnoException | koy e) {
            throw new IOException("Unable to create symlink", e);
        }
    }
}
