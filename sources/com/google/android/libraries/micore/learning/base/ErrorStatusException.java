package com.google.android.libraries.micore.learning.base;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ErrorStatusException extends Exception {
    public final jnr a;

    public ErrorStatusException(int i, String str) {
        this((Throwable) null, jnr.b(i, str));
    }

    public static ErrorStatusException a(int i, Throwable th) {
        return new ErrorStatusException(th, jnr.a(i));
    }

    public static ErrorStatusException b(int i, String str, Object... objArr) {
        return new ErrorStatusException((Throwable) null, jnr.c(i, str, objArr));
    }

    public static ErrorStatusException c(int i, Throwable th, String str, Object... objArr) {
        return new ErrorStatusException(th, jnr.c(i, str, objArr));
    }

    public ErrorStatusException(Throwable th, jnr jnrVar) {
        super(jnrVar.toString(), th);
        this.a = jnrVar;
    }
}
