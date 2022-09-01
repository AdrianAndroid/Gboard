package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kql  reason: default package */
/* loaded from: classes.dex */
public final class kql implements kqd {
    public final Context a;
    public final String b;
    public SharedPreferences c;
    private final Executor d;
    private final lgb e;
    private final opu f;

    public kql(kqj kqjVar) {
        this.a = kqjVar.a;
        this.d = kqjVar.b;
        this.b = kqjVar.c;
        this.f = kqjVar.e;
        this.e = kqjVar.d;
    }

    public static kqj d(Context context, Executor executor) {
        return new kqj(context.getApplicationContext(), executor);
    }

    @Override // defpackage.kqd
    public final mko a() {
        if (((Boolean) this.e.a()).booleanValue()) {
            return mkk.a;
        }
        return kcu.O(new jiz(this, 14), this.d);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kqk, java.lang.Object] */
    @Override // defpackage.kqd
    public final mko b(ngz ngzVar) {
        opu opuVar = this.f;
        return kcu.K(opuVar.a.a(new kdg(this.c), ngzVar));
    }

    @Override // defpackage.kqd
    public final mko c() {
        return kcu.O(new jiz(this, 13), this.d);
    }
}
