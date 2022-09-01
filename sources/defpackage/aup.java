package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: aup  reason: default package */
/* loaded from: classes.dex */
public final class aup extends IOException {
    private static final long serialVersionUID = 1;

    public aup(String str, int i) {
        this(str, i, null);
    }

    public aup(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
    }
}
