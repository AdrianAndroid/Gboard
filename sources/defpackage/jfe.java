package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: jfe  reason: default package */
/* loaded from: classes.dex */
public abstract class jfe implements jfp {
    public final int b;
    public volatile jfo c;

    public jfe(int i) {
        this.b = i;
    }

    @Override // defpackage.jfp
    public void b(jfo jfoVar) {
        this.c = jfoVar;
    }

    @Override // defpackage.jfp
    public final int d() {
        return this.b;
    }

    public final void e() {
        if (this.c != null) {
            jfo jfoVar = this.c;
            hsb hsbVar = (hsb) jfoVar;
            Set set = (Set) hsbVar.b.get(this.b);
            if (set != null) {
                ((hrx) hsbVar.c).V(set);
            } else {
                ((hrx) hsbVar.c).V(null);
            }
        }
    }
}
