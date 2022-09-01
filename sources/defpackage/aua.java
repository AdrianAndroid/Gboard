package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: aua  reason: default package */
/* loaded from: classes.dex */
public final class aua {
    public final aub a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ auc d;

    public aua(auc aucVar, aub aubVar) {
        this.d = aucVar;
        this.a = aubVar;
        this.b = aubVar.e ? null : new boolean[aucVar.d];
    }

    public final void a() {
        this.d.a(this, false);
    }

    public final void b() {
        if (!this.c) {
            try {
                a();
            } catch (IOException unused) {
            }
        }
    }
}
