package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fxz  reason: default package */
/* loaded from: classes.dex */
public final class fxz extends fya {
    private final joa a;

    public fxz(joa joaVar) {
        this.a = joaVar;
    }

    @Override // defpackage.fzf
    public final int b() {
        return 2;
    }

    @Override // defpackage.fya, defpackage.fzf
    public final joa c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fzf) {
            fzf fzfVar = (fzf) obj;
            if (fzfVar.b() == 2 && this.a.equals(fzfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        joa joaVar = this.a;
        int i = joaVar.cO;
        if (i != 0) {
            return i;
        }
        int b = nhh.a.b(joaVar).b(joaVar);
        joaVar.cO = b;
        return b;
    }

    public final String toString() {
        String obj = this.a.toString();
        return "TrainingTaskKey{personalizedTrainingOptions=" + obj + "}";
    }
}
