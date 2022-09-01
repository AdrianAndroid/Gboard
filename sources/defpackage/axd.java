package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: axd  reason: default package */
/* loaded from: classes.dex */
public final class axd extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private auw c;
    private Class d;
    private String e;
    private int f;

    public axd(String str) {
        this(str, Collections.emptyList());
    }

    private final void c(Throwable th, List list) {
        if (th instanceof axd) {
            for (Throwable th2 : ((axd) th).b) {
                c(th2, list);
            }
            return;
        }
        list.add(th);
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) {
        d(this, appendable);
        List list = this.b;
        axc axcVar = new axc(appendable);
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                axcVar.append("Cause (");
                int i2 = i + 1;
                axcVar.append(String.valueOf(i2));
                axcVar.append(" of ");
                axcVar.append(String.valueOf(size));
                axcVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof axd) {
                    ((axd) th).e(axcVar);
                } else {
                    d(th, axcVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(auw auwVar, int i, Class cls) {
        this.c = auwVar;
        this.f = i;
        this.d = cls;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class cls = this.d;
        String str = "";
        sb.append(cls != null ? ", ".concat(cls.toString()) : str);
        int i = this.f;
        sb.append(i != 0 ? ", ".concat(ce.d(i)) : str);
        auw auwVar = this.c;
        if (auwVar != null) {
            str = ", ".concat(auwVar.toString());
        }
        sb.append(str);
        List<Throwable> a2 = a();
        if (a2.isEmpty()) {
            return sb.toString();
        }
        if (a2.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a2.size());
            sb.append(" root causes:");
        }
        for (Throwable th : a2) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public axd(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }
}
