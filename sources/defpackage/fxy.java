package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fxy  reason: default package */
/* loaded from: classes.dex */
public final class fxy extends fya {
    private final jnz a;

    public fxy(jnz jnzVar) {
        this.a = jnzVar;
    }

    @Override // defpackage.fya, defpackage.fzf
    public final jnz a() {
        return this.a;
    }

    @Override // defpackage.fzf
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fzf) {
            fzf fzfVar = (fzf) obj;
            if (fzfVar.b() == 1 && this.a.equals(fzfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        jnz jnzVar = this.a;
        int i = jnzVar.cO;
        if (i != 0) {
            return i;
        }
        int b = nhh.a.b(jnzVar).b(jnzVar);
        jnzVar.cO = b;
        return b;
    }

    public final String toString() {
        String obj = this.a.toString();
        return "TrainingTaskKey{federatedTrainingOptions=" + obj + "}";
    }
}
