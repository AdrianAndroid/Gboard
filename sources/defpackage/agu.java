package defpackage;

import android.util.Log;
import java.io.PrintWriter;

/* compiled from: PG */
/* renamed from: agu  reason: default package */
/* loaded from: classes.dex */
public final class agu {
    public final afv a;
    public final agy b;

    public agu() {
    }

    public static agu a(afv afvVar) {
        return new agu(afvVar, ((agq) afvVar).at(), null, null);
    }

    public static boolean b(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    @Deprecated
    public final void c(String str, PrintWriter printWriter) {
        agy agyVar = this.b;
        if (agyVar.b.b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String concat = str.concat("    ");
            for (int i = 0; i < agyVar.b.b(); i++) {
                agv agvVar = (agv) agyVar.b.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(agyVar.b.a(i));
                printWriter.print(": ");
                printWriter.println(agvVar.toString());
                printWriter.print(concat);
                printWriter.print("mId=");
                printWriter.print(agvVar.j);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(concat);
                printWriter.print("mLoader=");
                printWriter.println(agvVar.k);
                ahc ahcVar = agvVar.k;
                String concat2 = concat.concat("  ");
                printWriter.print(concat2);
                printWriter.print("mId=");
                printWriter.print(ahcVar.d);
                printWriter.print(" mListener=");
                printWriter.println(ahcVar.e);
                if (ahcVar.g || ahcVar.j) {
                    printWriter.print(concat2);
                    printWriter.print("mStarted=");
                    printWriter.print(ahcVar.g);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(ahcVar.j);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (ahcVar.h || ahcVar.i) {
                    printWriter.print(concat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(ahcVar.h);
                    printWriter.print(" mReset=");
                    printWriter.println(ahcVar.i);
                }
                aha ahaVar = (aha) ahcVar;
                if (ahaVar.a != null) {
                    printWriter.print(concat2);
                    printWriter.print("mTask=");
                    printWriter.print(ahaVar.a);
                    printWriter.print(" waiting=");
                    boolean z = ahaVar.a.a;
                    printWriter.println(false);
                }
                if (ahaVar.b != null) {
                    printWriter.print(concat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(ahaVar.b);
                    printWriter.print(" waiting=");
                    boolean z2 = ahaVar.b.a;
                    printWriter.println(false);
                }
                if (agvVar.l != null) {
                    printWriter.print(concat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(agvVar.l);
                    agw agwVar = agvVar.l;
                    printWriter.print(concat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(agwVar.c);
                }
                printWriter.print(concat);
                printWriter.print("mData=");
                ahc ahcVar2 = agvVar.k;
                printWriter.println(ahc.e(agvVar.a()));
                printWriter.print(concat);
                printWriter.print("mStarted=");
                printWriter.println(agvVar.d > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.a.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.a)));
        sb.append("}}");
        return sb.toString();
    }

    public agu(afv afvVar, aqr aqrVar, byte[] bArr, byte[] bArr2) {
        this.a = afvVar;
        agn agnVar = agy.a;
        oll.e(aqrVar, "store");
        agr agrVar = agr.a;
        oll.e(aqrVar, "store");
        oll.e(agrVar, "defaultCreationExtras");
        this.b = (agy) vh.b(agy.class, aqrVar, agnVar, agrVar);
    }
}
