package defpackage;

/* compiled from: PG */
/* renamed from: bja  reason: default package */
/* loaded from: classes.dex */
public final class bja extends bim implements biw {
    public String a;

    public bja(String str) {
        this.a = str;
    }

    @Override // defpackage.biw
    public final biv m() {
        return null;
    }

    @Override // defpackage.bim
    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String str = this.a;
        return simpleName + " '" + str + "'";
    }
}
