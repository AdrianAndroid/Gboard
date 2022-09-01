package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: jhq  reason: default package */
/* loaded from: classes.dex */
public final class jhq extends Exception {
    public final llp a;

    private jhq(String str, Throwable th, llp llpVar) {
        super(str, th);
        this.a = llpVar;
    }

    static Throwable a(Throwable th) {
        Throwable cause = th.getCause();
        return (cause != null && th.getClass().equals(ExecutionException.class)) ? a(cause) : th;
    }

    public static void b(Collection collection, Object... objArr) {
        Iterator it = collection.iterator();
        llk llkVar = null;
        while (it.hasNext()) {
            try {
                kcu.S((mko) it.next());
            } catch (CancellationException | ExecutionException e) {
                if (llkVar == null) {
                    llkVar = llp.e();
                }
                llkVar.h(a(e));
            }
        }
        if (llkVar == null) {
            return;
        }
        llp g = llkVar.g();
        String format = String.format(Locale.US, "Failed to download file group %s", objArr);
        int i = ((lrl) g).c;
        if (i > 1) {
            String str = format + "\n" + i + " failure(s) in total:\n";
            try {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                printWriter.println(str);
                int i2 = 0;
                while (i2 < ((lrl) g).c) {
                    i2++;
                    printWriter.printf("--- Failure %d ----------------------------\n", Integer.valueOf(i2));
                    printWriter.println(c((Throwable) g.get(i2), 1));
                }
                printWriter.println("-------------------------------------------");
                format = stringWriter.toString();
                printWriter.close();
                stringWriter.close();
            } catch (Throwable th) {
                format = "Failed to build string from throwables: ".concat(th.toString());
            }
        }
        throw new jhq(format, (Throwable) g.get(0), g);
    }

    private static String c(Throwable th, int i) {
        String str = th.getClass().getName() + ": " + th.getMessage();
        Throwable cause = th.getCause();
        if (cause != null) {
            if (i >= 5) {
                return str.concat("\n(...)");
            }
            return str + "\nCaused by: " + c(cause, i + 1);
        }
        return str;
    }
}
