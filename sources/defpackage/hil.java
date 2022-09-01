package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: hil  reason: default package */
/* loaded from: classes.dex */
public final class hil extends Throwable {
    public hil() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int i = 0;
        boolean z = false;
        while (true) {
            int length = stackTrace.length;
            if (i < length) {
                if (ltm.class.getName().equals(stackTrace[i].getClassName())) {
                    z = true;
                } else if (z) {
                    setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
