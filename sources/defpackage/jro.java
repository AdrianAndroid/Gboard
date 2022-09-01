package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: jro  reason: default package */
/* loaded from: classes.dex */
public final class jro extends Exception {
    public final llp a;

    private jro(String str, Throwable th, llp llpVar) {
        super(str, th);
        this.a = llpVar;
    }

    public static jro a(String str, llp llpVar) {
        return new jro(str, (Throwable) llpVar.get(0), llpVar);
    }

    public static void b(Collection collection, String str, Object... objArr) {
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        llk llkVar = null;
        while (it.hasNext()) {
            try {
                kcu.S((mko) it.next());
            } catch (ExecutionException e) {
                if (llkVar == null) {
                    llkVar = llp.e();
                }
                llkVar.h(lwm.w(e));
            }
        }
        if (llkVar == null) {
            return;
        }
        llp g = llkVar.g();
        String format = String.format(Locale.US, str, objArr);
        int i = ((lrl) g).c;
        if (i > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append("\n");
            sb.append(i - 1);
            sb.append(" additional failure(s) besides cause:\n");
            String sb2 = sb.toString();
            StringWriter stringWriter = new StringWriter();
            StringBuffer buffer = stringWriter.getBuffer();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                printWriter.println(sb2);
                int i2 = 1;
                int i3 = 0;
                while (i2 < ((lrl) g).c) {
                    Throwable th = (Throwable) g.get(i2);
                    i2++;
                    printWriter.printf("--- Failure %d ----------------------------\n", Integer.valueOf(i2));
                    if (i3 > 32) {
                        printWriter.println(lwm.v(th, 1));
                    } else {
                        th.printStackTrace(printWriter);
                        int i4 = 1;
                        for (int length = buffer.length() - 1; length < buffer.length(); length++) {
                            if (buffer.charAt(length) == '\n') {
                                i4++;
                            }
                        }
                        i3 += i4;
                    }
                }
                printWriter.println("-------------------------------------------");
                String stringWriter2 = stringWriter.toString();
                for (jrt u = lwm.u(stringWriter2, 0); u != null; u = lwm.u(stringWriter2, u.b + 1)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 < arrayList.size()) {
                            jrt jrtVar = (jrt) arrayList.get(i5);
                            if (jrtVar.e >= 0) {
                                i6++;
                            }
                            if (jrtVar.hashCode() == u.hashCode()) {
                                u.e = i6;
                                break;
                            }
                            i5++;
                        }
                    }
                    arrayList.add(u);
                }
                if (arrayList != null) {
                    StringBuilder sb3 = new StringBuilder();
                    int i7 = 0;
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        jrt jrtVar2 = (jrt) arrayList.get(i8);
                        sb3.append((CharSequence) stringWriter2, i7, jrtVar2.a);
                        if (jrtVar2.e >= 0) {
                            sb3.append("\tSame as stack trace [");
                            sb3.append(jrtVar2.e + 1);
                            sb3.append("]\n");
                        } else {
                            sb3.append(jrtVar2);
                        }
                        i7 = jrtVar2.b + 1;
                    }
                    if (i7 < stringWriter2.length()) {
                        sb3.append((CharSequence) stringWriter2, i7, stringWriter2.length());
                    }
                    format = sb3.toString();
                } else {
                    format = stringWriter2;
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        throw a(format, g);
    }
}
