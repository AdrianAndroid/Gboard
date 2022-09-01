package defpackage;

import android.database.Cursor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jky  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jky implements leq {
    private final /* synthetic */ int s;
    public static final /* synthetic */ jky r = new jky(20);
    public static final /* synthetic */ jky q = new jky(19);
    public static final /* synthetic */ jky p = new jky(18);
    public static final /* synthetic */ jky o = new jky(17);
    public static final /* synthetic */ jky n = new jky(16);
    public static final /* synthetic */ jky m = new jky(15);
    public static final /* synthetic */ jky l = new jky(14);
    public static final /* synthetic */ jky k = new jky(13);
    public static final /* synthetic */ jky j = new jky(12);
    public static final /* synthetic */ jky i = new jky(11);
    public static final /* synthetic */ jky h = new jky(9);
    public static final /* synthetic */ jky g = new jky(8);
    public static final /* synthetic */ jky f = new jky(7);
    public static final /* synthetic */ jky e = new jky(6);
    public static final /* synthetic */ jky d = new jky(4);
    public static final /* synthetic */ jky c = new jky(3);
    public static final /* synthetic */ jky b = new jky(2);
    public static final /* synthetic */ jky a = new jky(0);

    public /* synthetic */ jky(int i2) {
        this.s = i2;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        switch (this.s) {
            case 0:
                Void r8 = (Void) obj;
                return true;
            case 1:
                jmk.a("Failed to commit migration metadata to disk");
                new Exception("Migration to ChecksumOnly failed.", (IOException) obj);
                return false;
            case 2:
                IOException iOException = (IOException) obj;
                return false;
            case 3:
                jiw jiwVar = (jiw) obj;
                nfh nfhVar = (nfh) jiwVar.N(5);
                nfhVar.cG(jiwVar);
                nfhVar.b = (nfm) nfhVar.b.N(4);
                return (jiw) nfhVar.cz();
            case 4:
                Void r82 = (Void) obj;
                return true;
            case 5:
                jmk.a("Failed to commit migration metadata to disk");
                new Exception("Migration to DownloadTransform failed.", (IOException) obj);
                return false;
            case 6:
                Void r83 = (Void) obj;
                return true;
            case 7:
                IOException iOException2 = (IOException) obj;
                return false;
            case 8:
                return ((jug) obj).i(true, false);
            case 9:
                return ((jsr) obj).f();
            case 10:
                juc jucVar = (juc) obj;
                return jucVar != null ? jucVar.o().g(false) : "null";
            case 11:
                lfc lfcVar = (lfc) obj;
                jdg.u(lfcVar);
                return lfcVar.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Set set = jtq.a;
                return obj == null ? "" : obj.toString();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Cursor cursor = (Cursor) obj;
                jdg.u(cursor);
                String string = cursor.getString(0);
                if (string == null) {
                    ((luc) jsh.a.d()).w("Invalid versioned name found in %s, ignoring row...", "manifest_table");
                    return null;
                }
                return jtr.c(string, cursor.getInt(1));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Cursor cursor2 = (Cursor) obj;
                jdg.u(cursor2);
                return cursor2.getString(0);
            case 15:
                Cursor cursor3 = (Cursor) obj;
                jdg.u(cursor3);
                return cursor3.getString(0);
            case 16:
                int i2 = jvu.b;
                File parentFile = ((File) obj).getParentFile();
                return parentFile == null ? "" : parentFile.getName();
            case 17:
                return jwc.a((Throwable) obj);
            case 18:
                return mln.a((String) obj);
            case 19:
                return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
            default:
                return new ArrayList(((LinkedHashMap) obj).values());
        }
    }
}
