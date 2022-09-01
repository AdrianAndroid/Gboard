package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: lni  reason: default package */
/* loaded from: classes.dex */
final class lni extends llv {
    private static final long serialVersionUID = 0;
    private final Comparator a;

    public lni(lnj lnjVar) {
        super(lnjVar);
        this.a = lnjVar.comparator();
    }

    @Override // defpackage.llv
    public final /* bridge */ /* synthetic */ lls a(int i) {
        return new lnh(this.a);
    }
}
