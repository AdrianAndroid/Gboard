package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gug  reason: default package */
/* loaded from: classes.dex */
public final class gug {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/alertdialog/AlertDialogFragmentPeer");
    public final String b;
    public final int c;
    private Future d;
    private jyw e;

    public gug(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public static gug a(guf gufVar, Bundle bundle) {
        String string = bundle.getString("ALERT_DIALOG_ID");
        if (string != null) {
            return new gug(string, bundle.getInt("ALERT_DIALOG_THEME_ID", 0));
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/alertdialog/AlertDialogFragmentPeer", "restoreFrom", 72, "AlertDialogFragmentPeer.java")).t("Auto dismiss dialog fragment due to missing of saved state");
        gufVar.setShowsDialog(false);
        gufVar.dismiss();
        return null;
    }

    public final void b(gtz gtzVar, Dialog dialog) {
        if (gtzVar == null || dialog == null) {
            return;
        }
        gui.b(this.b, dialog);
    }

    public final void c(guf gufVar) {
        if (!gui.d(this.b)) {
            gufVar.setShowsDialog(false);
            this.e = new jyw(this, gufVar);
            ijl b = ijl.b();
            jyw jywVar = this.e;
            gyc gycVar = gyc.b;
            synchronized (gui.class) {
                WeakHashMap weakHashMap = (WeakHashMap) b.c.get(gui.class);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap();
                    b.c.put(gui.class, weakHashMap);
                }
                weakHashMap.put(jywVar, gycVar);
            }
            this.d = gyc.b.a(new fso(this, gufVar, 18), 2L, TimeUnit.SECONDS);
        }
    }

    public final void d(gtz gtzVar, Dialog dialog) {
        if (gtzVar == null || dialog == null) {
            return;
        }
        gtzVar.d(this.b, dialog);
    }

    public final void e(Bundle bundle) {
        bundle.putString("ALERT_DIALOG_ID", this.b);
        bundle.putInt("ALERT_DIALOG_THEME_ID", this.c);
    }

    public final boolean f() {
        Future future = this.d;
        if (future != null) {
            future.cancel(false);
            this.d = null;
        }
        if (this.e != null) {
            ijl b = ijl.b();
            jyw jywVar = this.e;
            synchronized (gui.class) {
                WeakHashMap weakHashMap = (WeakHashMap) b.c.get(gui.class);
                if (weakHashMap != null) {
                    weakHashMap.remove(jywVar);
                    if (weakHashMap.isEmpty()) {
                        b.c.remove(gui.class);
                    }
                }
            }
            this.e = null;
            return true;
        }
        return false;
    }
}
