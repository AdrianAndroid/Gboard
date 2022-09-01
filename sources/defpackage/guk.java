package defpackage;

import android.content.Context;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: guk  reason: default package */
/* loaded from: classes.dex */
public final class guk extends Enum implements gud {
    public static final guk a;
    private static final /* synthetic */ guk[] b;

    static {
        guk gukVar = new guk();
        a = gukVar;
        b = new guk[]{gukVar};
    }

    private guk() {
    }

    public static guk[] values() {
        return (guk[]) b.clone();
    }

    @Override // defpackage.gud
    public final /* synthetic */ void a(Context context, String str) {
        b(context, str, 0);
    }

    @Override // defpackage.gud
    public final void b(Context context, String str, int i) {
        new guj(context, i).f(str);
    }
}
