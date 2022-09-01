package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Printer;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ema  reason: default package */
/* loaded from: classes.dex */
public final class ema implements elt {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/sharing/SharingExtension");
    private Context b;

    private final boolean d() {
        Context context = this.b;
        return context != null && context.getResources().getBoolean(R.bool.f19350_resource_name_obfuscated_res_0x7f05000b);
    }

    @Override // defpackage.elt
    public final void c() {
        int i;
        if (!d()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/sharing/SharingExtension", "showDialog", 40, "SharingExtension.java")).t("Firebase is not enabled!");
            return;
        }
        hsk b = hsx.b();
        if (b == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/sharing/SharingExtension", "showDialog", 46, "SharingExtension.java")).t("InputMethodService is not created!");
            return;
        }
        IBinder F = b.F();
        if (F == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/sharing/SharingExtension", "showDialog", 52, "SharingExtension.java")).t("WindowToken is null!");
            return;
        }
        EditorInfo M = b.M();
        els elsVar = new els(b.D());
        Window window = b.getWindow().getWindow();
        if (window != null) {
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.height();
        } else {
            i = 0;
        }
        elsVar.i(F, "access_point", i, M);
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/sharing/SharingExtension", "showDialog", 63, "SharingExtension.java")).w("Sharing link send dialog shown from %s", "access_point");
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean d = d();
        printer.println("Firebase enabled: " + d);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "SharingExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.b = context;
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.b = null;
    }
}
