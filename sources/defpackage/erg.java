package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: erg */
/* loaded from: classes.dex */
public final class erg {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static InputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.open("theme/" + str);
        } catch (IOException unused) {
            return null;
        }
    }

    public static eri c(Context context, erb erbVar, int i, String str) {
        epy b;
        if (erbVar == null || (b = epy.b(context, context.getString(i), "")) == null) {
            return null;
        }
        nfh t = eve.k.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        eve eveVar = (eve) t.b;
        eveVar.a |= 2;
        eveVar.e = str;
        euw b2 = erbVar.b();
        String c = erbVar.c();
        eve eveVar2 = b.a;
        nfh nfhVar = (nfh) eveVar2.N(5);
        nfhVar.cG(eveVar2);
        nfhVar.cG((eve) t.cz());
        return new eql(b, b2, (eve) nfhVar.cz(), "overlay_" + b.b + ":" + c);
    }

    public static /* synthetic */ void d(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }
}
