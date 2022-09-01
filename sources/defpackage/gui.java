package defpackage;

import android.app.Dialog;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: gui  reason: default package */
/* loaded from: classes.dex */
public class gui implements ijg {
    public final String a;
    public final int b;
    public final gub c;
    public final Dialog d;
    public final guw e;

    public gui(String str, int i, gub gubVar, Dialog dialog, guw guwVar, byte[] bArr) {
        this.a = str;
        this.b = i;
        this.c = gubVar;
        this.d = dialog;
        this.e = guwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str, Dialog dialog) {
        c(4, str, dialog);
    }

    public static void c(int i, String str, Dialog dialog) {
        ijl.b().g(new gui(str, i, null, dialog, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        ijl b = ijl.b();
        ein einVar = new ein(str, 10);
        synchronized (gui.class) {
            WeakHashMap weakHashMap = (WeakHashMap) b.b.get(gui.class);
            if (weakHashMap != null) {
                for (ijj ijjVar : weakHashMap.keySet()) {
                    if (einVar.a(ijjVar)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }
}
