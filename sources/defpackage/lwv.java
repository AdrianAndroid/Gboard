package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* renamed from: lwv  reason: default package */
/* loaded from: classes.dex */
public final class lwv extends lww {
    private final lwu c;

    public lwv(luj lujVar, int i, lwu lwuVar) {
        super(lujVar, i);
        this.c = lwuVar;
        StringBuilder sb = new StringBuilder("%");
        lujVar.f(sb);
        sb.append(true != lujVar.d() ? 't' : 'T');
        sb.append(lwuVar.G);
    }

    @Override // defpackage.lww
    public final void a(lwx lwxVar, Object obj) {
        lwu lwuVar = this.c;
        luj lujVar = this.b;
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb = new StringBuilder("%");
            lujVar.f(sb);
            sb.append(true != lujVar.d() ? 't' : 'T');
            sb.append(lwuVar.G);
            ((lxb) lwxVar).d.append(String.format(lup.a, sb.toString(), obj));
            return;
        }
        StringBuilder sb2 = ((lxb) lwxVar).d;
        lxb.d(sb2, obj, "%t" + lwuVar.G);
    }
}
