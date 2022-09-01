package defpackage;

import android.graphics.Path;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjh  reason: default package */
/* loaded from: classes.dex */
public final class bjh extends bji {
    final /* synthetic */ bjo a;
    private final Path e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjh(bjo bjoVar, Path path, float f) {
        super(bjoVar, f, 0.0f);
        this.a = bjoVar;
        this.e = path;
    }

    @Override // defpackage.bji, defpackage.bjm
    public final void a(String str) {
        if (this.a.i()) {
            bjo bjoVar = this.a;
            bjk bjkVar = bjoVar.f;
            if (bjkVar.b) {
                bjoVar.a.drawTextOnPath(str, this.e, this.b, this.c, bjkVar.d);
            }
            bjo bjoVar2 = this.a;
            bjk bjkVar2 = bjoVar2.f;
            if (bjkVar2.c) {
                bjoVar2.a.drawTextOnPath(str, this.e, this.b, this.c, bjkVar2.e);
            }
        }
        this.b += this.a.f.d.measureText(str);
    }
}
