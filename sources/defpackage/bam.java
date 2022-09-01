package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* renamed from: bam  reason: default package */
/* loaded from: classes.dex */
public final class bam implements avd {
    private final axp a;
    private final avd b;

    public bam(axp axpVar, avd avdVar) {
        this.a = axpVar;
        this.b = avdVar;
    }

    @Override // defpackage.auo
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, ava avaVar) {
        return this.b.a(new bbn(((BitmapDrawable) ((axh) obj).c()).getBitmap(), this.a, 1), file, avaVar);
    }

    @Override // defpackage.avd
    public final int b() {
        return 2;
    }
}
