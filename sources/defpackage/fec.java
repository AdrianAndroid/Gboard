package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: fec  reason: default package */
/* loaded from: classes.dex */
public final class fec implements fdl {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognizerModule");
    private Context b;

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean b = fdz.b();
        printer.println("Flag Enabled = " + b);
        boolean a2 = fdz.a(this.b);
        StringBuilder sb = new StringBuilder("Setting Enabled = ");
        sb.append(!a2);
        printer.println(sb.toString());
        printer.println("Manifest URL = ".concat(String.valueOf((String) ffa.q.c())));
        printer.println("Force Updates = ".concat(String.valueOf(String.valueOf(ffa.d.c()))));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "OnDeviceRecognizerModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognizerModule", "onCreate", 20, "OnDeviceRecognizerModule.java")).t("onCreate()");
        this.b = context;
        feo.c(context, "speech-packs").g();
        fao.h(new feb(context));
    }

    @Override // defpackage.ifw
    public final void gn() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognizerModule", "onDestroy", 32, "OnDeviceRecognizerModule.java")).t("onDestroy()");
        fao.h(null);
    }
}
