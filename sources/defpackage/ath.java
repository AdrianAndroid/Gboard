package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ath  reason: default package */
/* loaded from: classes.dex */
public final class ath extends ContextWrapper {
    static final atx a = new atx();
    public final axn b;
    public final List c;
    public final Map d;
    public final int e = 4;
    public final aqr f;
    public final dg g;
    public final kdr h;
    private final bgd i;
    private beu j;

    public ath(Context context, axn axnVar, bgd bgdVar, dg dgVar, Map map, List list, kdr kdrVar, aqr aqrVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(context.getApplicationContext());
        this.b = axnVar;
        this.g = dgVar;
        this.c = list;
        this.d = map;
        this.h = kdrVar;
        this.f = aqrVar;
        this.i = dg.i(bgdVar);
    }

    public final synchronized beu a() {
        if (this.j == null) {
            beu beuVar = new beu();
            beuVar.V();
            this.j = beuVar;
        }
        return this.j;
    }

    public final bmf b() {
        return (bmf) this.i.a();
    }
}
