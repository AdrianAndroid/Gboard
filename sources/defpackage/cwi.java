package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lfu  reason: default package */
/* loaded from: classes.dex */
public final class lfu implements lfx {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lfu(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public lfu(lek lekVar, int i) {
        this.b = i;
        this.a = lekVar;
    }

    public lfu(lem lemVar, int i) {
        this.b = i;
        this.a = lemVar;
    }

    @Override // defpackage.lfx
    public final /* synthetic */ Iterator a(lfy lfyVar, CharSequence charSequence) {
        int i = this.b;
        return i != 0 ? i != 1 ? new lfv(lfyVar, charSequence, ((lem) this.a).a(charSequence), null, null) : new lfs(this, lfyVar, charSequence, null) : new lft(this, lfyVar, charSequence);
    }
}
