package defpackage;

import android.content.DialogInterface;
import android.os.Build;
import android.os.IBinder;
import android.view.Window;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodSubtype;

/* compiled from: PG */
/* renamed from: hpq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hpq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ hpq(InputConnection inputConnection, CharSequence charSequence, int i, Object obj, int i2) {
        this.e = i2;
        this.c = inputConnection;
        this.d = charSequence;
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ hpq(hmd hmdVar, CharSequence charSequence, int i, Object obj, int i2) {
        this.e = i2;
        this.c = hmdVar;
        this.d = charSequence;
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ hpq(hxt hxtVar, DialogInterface dialogInterface, int i, hxu hxuVar, int i2) {
        this.e = i2;
        this.d = hxtVar;
        this.c = dialogInterface;
        this.a = i;
        this.b = hxuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, android.content.DialogInterface] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            ?? r0 = this.c;
            ?? r1 = this.d;
            int i2 = this.a;
            Object obj = this.b;
            ltg ltgVar = hpr.a;
            hpw.k(r0, r1, i2, obj);
        } else if (i == 1) {
            Object obj2 = this.c;
            ((hmd) obj2).a.S(this.d, this.a, this.b);
        } else {
            Object obj3 = this.d;
            ?? r12 = this.c;
            int i3 = this.a;
            Object obj4 = this.b;
            hxv hxvVar = ((hxt) obj3).a;
            IBinder iBinder = null;
            if (i3 == -3 || i3 == -1) {
                hxvVar.f.j(hxvVar.e.a(), 5, null);
                hxvVar.a(10);
                return;
            }
            r12.dismiss();
            Object item = ((hxu) obj4).getItem(i3);
            if (item instanceof hqt) {
                ifh.b(ifh.b);
                hxvVar.f.k((hqt) item);
                hxvVar.a(11);
                return;
            }
            jao jaoVar = (jao) item;
            String id = jaoVar.a.getId();
            InputMethodSubtype inputMethodSubtype = jaoVar.b;
            if (inputMethodSubtype == null) {
                hxvVar.d.switchInputMethod(id);
            } else if (Build.VERSION.SDK_INT >= 28) {
                hxvVar.d.switchInputMethod(id, inputMethodSubtype);
            } else {
                Window window = hxvVar.d.getWindow().getWindow();
                if (window != null) {
                    iBinder = window.getAttributes().token;
                }
                if (iBinder != null) {
                    hxvVar.g.f(jaoVar.a, iBinder, inputMethodSubtype);
                } else {
                    ((ltd) ((ltd) hxv.a.c()).k("com/google/android/libraries/inputmethod/languageselection/picker/LanguagePicker", "onClickImpl", 212, "LanguagePicker.java")).t("Cannot switch input method due to null window token!");
                }
            }
            hxvVar.a(12);
        }
    }
}
