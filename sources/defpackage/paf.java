package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* renamed from: paf  reason: default package */
/* loaded from: classes2.dex */
public final class paf extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private final List a;
    private final String b;
    private Throwable c;

    public paf(Collection collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            if (th instanceof paf) {
                linkedHashSet.addAll(((paf) th).a);
            } else if (th != null) {
                linkedHashSet.add(th);
            } else {
                linkedHashSet.add(new NullPointerException());
            }
        }
        arrayList.addAll(linkedHashSet);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        this.a = unmodifiableList;
        this.b = unmodifiableList.size() + " exceptions occurred. ";
    }

    private final void a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    private final void b(pac pacVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        synchronized (pacVar.a()) {
            pacVar.b(sb.toString());
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        if (this.c == null) {
            pab pabVar = new pab();
            HashSet hashSet = new HashSet();
            Throwable th = pabVar;
            for (Throwable th2 : this.a) {
                if (!hashSet.contains(th2)) {
                    hashSet.add(th2);
                    ArrayList<Throwable> arrayList = new ArrayList();
                    Throwable cause = th2.getCause();
                    if (cause != null && cause != th2) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause.getCause();
                        }
                    }
                    for (Throwable th3 : arrayList) {
                        if (hashSet.contains(th3)) {
                            th2 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th3);
                        }
                    }
                    try {
                        th.initCause(th2);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = th.getCause();
                    if (cause3 != null && cause3 != th) {
                        th = cause3;
                        while (true) {
                            Throwable cause4 = th.getCause();
                            if (cause4 != null && cause4 != th) {
                                th = th.getCause();
                            }
                        }
                    }
                }
            }
            this.c = pabVar;
        }
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new pad(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new pae(printWriter));
    }
}
