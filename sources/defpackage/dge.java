package defpackage;

import com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingMotionEventHandler;

/* compiled from: PG */
/* renamed from: dge  reason: default package */
/* loaded from: classes.dex */
public final class dge implements hfh {
    final /* synthetic */ HandwritingMotionEventHandler a;

    public dge(HandwritingMotionEventHandler handwritingMotionEventHandler) {
        this.a = handwritingMotionEventHandler;
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f;
        if (hfdVar.k == this || hfdVar.a == iah.UP || (f = hfdVar.f()) == null) {
            return false;
        }
        if (f.c != 67 || !this.a.h.g()) {
            int i = f.c;
            if (i == 67 || i == 66 || i == 62) {
                this.a.i();
            }
            int i2 = f.c;
            if (i2 == -10039) {
                dgk dgkVar = this.a.h;
                dgkVar.i.g((int[]) f.e, dgkVar.b, llp.o(dgkVar.c));
                return true;
            } else if (i2 == -10002) {
                this.a.j.run();
                this.a.i();
                return false;
            } else if (i2 == -10071) {
                this.a.j.run();
                return false;
            } else if (i2 == -10093) {
                iay iayVar = HandwritingMotionEventHandler.a;
                this.a.d = true;
                return false;
            } else {
                if (i2 == -10094) {
                    iay iayVar2 = HandwritingMotionEventHandler.a;
                    this.a.d = false;
                }
                return false;
            }
        }
        this.a.j.run();
        return true;
    }
}
