package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iwt  reason: default package */
/* loaded from: classes.dex */
public final class iwt implements iws {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/storage/ProtoXDBBufferWrapper");
    public static final hhl b = hhq.f("protoxdb_buffer_size_limit", 50);
    public final ipk c;
    public final Executor d;
    public final boe e = new boe((byte[]) null, (char[]) null);

    public iwt(ipk ipkVar, Executor executor) {
        this.c = ipkVar;
        this.d = executor;
    }

    @Override // defpackage.ipk
    public final iph a(String str, ipz ipzVar) {
        c();
        ipr iprVar = (ipr) ((ipm) this.c).c.get(str);
        if (iprVar != null) {
            return new ipc(iprVar.d.query(iprVar.b, iprVar.i, ipzVar.d, ipzVar.e, null, null, ipzVar.f, ipzVar.g), new hdp(iprVar, 20), ipzVar.h);
        }
        ((ltd) ((ltd) ipm.a.c()).k("com/google/android/libraries/inputmethod/protoxdb/ProtoXDB", "selectDataItems", 101, "ProtoXDB.java")).w("Failed to select data items because given table name [%s] not exists", str);
        return ipg.a;
    }

    @Override // defpackage.ipk
    public final llw b(String str) {
        ipr iprVar = (ipr) ((ipm) this.c).c.get(str);
        if (iprVar != null) {
            return iprVar.h;
        }
        ((ltd) ((ltd) ipm.a.c()).k("com/google/android/libraries/inputmethod/protoxdb/ProtoXDB", "getQueryableColumns", 193, "ProtoXDB.java")).w("Failed to get queryable columns because given table name [%s] not exists", str);
        return lrq.b;
    }

    @Override // defpackage.iws
    public final void c() {
        ipi a2;
        llp<ipb> x = this.e.x();
        if (!x.isEmpty()) {
            ipk ipkVar = this.c;
            if (!x.isEmpty()) {
                HashSet<ipr> hashSet = new HashSet();
                ipm ipmVar = (ipm) ipkVar;
                ipmVar.e.beginTransaction();
                try {
                    for (ipb ipbVar : x) {
                        ipr iprVar = (ipr) ((ipm) ipkVar).c.get(ipbVar.a);
                        if (iprVar != null) {
                            if (!ipbVar.a.equals(iprVar.b)) {
                                ((ltd) ipr.a.a(hip.a).k("com/google/android/libraries/inputmethod/protoxdb/TableSchema", "addDataItem", 149, "TableSchema.java")).G("Table name mismatch. this table name: %s, data item table name: %s", iprVar.b, ipbVar.a);
                            } else {
                                ContentValues contentValues = new ContentValues();
                                if (ipbVar.c == null && ipbVar.d == null) {
                                    throw new IllegalArgumentException("message and protoBytes should not be null at the same time.");
                                }
                                if (!iprVar.e.isEmpty()) {
                                    ngz ngzVar = ipbVar.c;
                                    byte[] bArr = ipbVar.d;
                                    if (ngzVar != null) {
                                        a2 = iprVar.c.a.a().b(ngzVar);
                                    } else {
                                        if (bArr != null) {
                                            try {
                                                a2 = iprVar.c.a.a().a(bArr);
                                            } catch (ngd e) {
                                                ((ltd) ((ltd) ((ltd) ipr.a.c()).i(e)).k("com/google/android/libraries/inputmethod/protoxdb/TableSchema", "extractFieldsFromProto", (char) 512, "TableSchema.java")).t("Failed to create proto adapter from byte array");
                                            }
                                        }
                                        a2 = null;
                                    }
                                    if (a2 != null) {
                                        ipr.c(contentValues, iprVar.e, a2, false);
                                    }
                                }
                                byte[] bArr2 = ipbVar.d;
                                if (bArr2 == null) {
                                    ngz ngzVar2 = ipbVar.c;
                                    if (ngzVar2 != null) {
                                        bArr2 = ngzVar2.q();
                                    }
                                    ipr.c(contentValues, iprVar.f, ipbVar.b, false);
                                    ipr.c(contentValues, iprVar.c.b, ipbVar.b, true);
                                    contentValues.put("_timestamp_", Long.valueOf(ipbVar.b.a("_timestamp_", System.currentTimeMillis())));
                                    ipf.j(iprVar.d, iprVar.b, contentValues, iprVar.c.f);
                                }
                                contentValues.put("_blob_", bArr2);
                                contentValues.put("_hash_", Integer.valueOf(Arrays.hashCode(bArr2)));
                                ipr.c(contentValues, iprVar.f, ipbVar.b, false);
                                ipr.c(contentValues, iprVar.c.b, ipbVar.b, true);
                                contentValues.put("_timestamp_", Long.valueOf(ipbVar.b.a("_timestamp_", System.currentTimeMillis())));
                                ipf.j(iprVar.d, iprVar.b, contentValues, iprVar.c.f);
                            }
                            hashSet.add(iprVar);
                        }
                    }
                    for (ipr iprVar2 : hashSet) {
                        long queryNumEntries = DatabaseUtils.queryNumEntries(iprVar2.d, iprVar2.b);
                        int i = iprVar2.c.e.d;
                        if (i > 0 && queryNumEntries >= i) {
                            iprVar2.d();
                        }
                    }
                    ((ipm) ipkVar).e.setTransactionSuccessful();
                } finally {
                    ipmVar.e.endTransaction();
                }
            }
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/trainingcache/storage/ProtoXDBBufferWrapper", "flushToStorage", 153, "ProtoXDBBufferWrapper.java")).u("Flushed %d data item(s) to storage.", x.size());
        }
    }

    @Override // defpackage.ipk, java.lang.AutoCloseable
    public final void close() {
        c();
        this.c.close();
    }
}
