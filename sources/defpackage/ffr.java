package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: ffr  reason: default package */
/* loaded from: classes.dex */
public final class ffr implements ffs {
    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Fallback to OnDevice Feature enabled: ".concat(String.valueOf(String.valueOf(ffa.e.c()))));
        printer.println("Speechpack manifest url = ".concat(String.valueOf((String) ffa.r.c())));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "FallbackOnDeviceRecognizer";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        feo.c(context, "gboard-small-speech-packs").g();
        fao.g(new ffq(context));
    }

    @Override // defpackage.ifw
    public final void gn() {
        fao.g(null);
    }
}
