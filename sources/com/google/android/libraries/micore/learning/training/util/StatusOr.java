package com.google.android.libraries.micore.learning.training.util;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StatusOr {
    private final Object a;
    private final jnr b;

    private StatusOr(Object obj, jnr jnrVar) {
        boolean z = true;
        jdg.v((jnrVar != null ? false : z) ^ (obj == null));
        this.a = obj;
        this.b = jnrVar;
    }

    public static StatusOr a(Object obj) {
        return new StatusOr(obj, null);
    }

    public static StatusOr b(jnr jnrVar) {
        return new StatusOr(null, jnrVar);
    }

    public int getCode() {
        jnr jnrVar = this.b;
        if (jnrVar == null) {
            return 0;
        }
        return jnrVar.a;
    }

    public String getDetails() {
        jnr jnrVar = this.b;
        return jnrVar == null ? "" : jnrVar.b;
    }

    public Object valueOrDie() {
        jdg.u(this.a);
        jdg.F(this.b == null);
        return this.a;
    }
}
