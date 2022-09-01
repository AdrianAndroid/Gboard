package defpackage;

import java.util.Queue;

/* compiled from: PG */
/* renamed from: axo  reason: default package */
/* loaded from: classes.dex */
abstract class axo {
    private final Queue a = bgj.i(20);

    public abstract axz a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final axz b() {
        axz axzVar = (axz) this.a.poll();
        return axzVar == null ? a() : axzVar;
    }

    public final void c(axz axzVar) {
        if (this.a.size() < 20) {
            this.a.offer(axzVar);
        }
    }
}
