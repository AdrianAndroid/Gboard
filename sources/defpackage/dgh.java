package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dgh  reason: default package */
/* loaded from: classes.dex */
final class dgh {
    public float a;
    public float b;
    public int c = 500;
    public float d = 1.0f;
    public float e = 0.0f;
    public final ino f;

    public dgh(Context context) {
        this.a = 0.0f;
        this.b = 1.0f;
        ino M = ino.M(context);
        this.f = M;
        this.a = M.a("pressure_min", 0.0f);
        this.b = M.a("pressure_max", 0.0f);
    }
}
