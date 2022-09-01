package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: jvk  reason: default package */
/* loaded from: classes.dex */
public final class jvk implements jvf {
    private static final String[] c = {"superpack_name", "superpack_version", "pack_list", "sync_metadata"};
    private static final String[] d = {"superpack_name", "superpack_version", "pack_list"};
    private static final String[] e = {"superpack_name"};
    public final jum a;
    public final jtb b = new juz(this, 3);

    public jvk(jum jumVar) {
        this.a = jumVar;
    }

    @Override // defpackage.jvf
    public final jve a(String str, boolean z) {
        int i;
        jss c2;
        Object obj;
        Object obj2;
        Cursor cursor = null;
        byte[] bArr = null;
        cursor = null;
        try {
            try {
                Cursor query = this.a.getReadableDatabase().query("selected_packs", z ? c : d, "superpack_name=?", new String[]{str}, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToNext()) {
                            int i2 = query.getInt(1);
                            if (z) {
                                bArr = query.getBlob(3);
                            }
                            String string = query.getString(2);
                            List k = jut.b.k(string);
                            int size = k.size();
                            if (size == 1) {
                                i = 0;
                            } else if (size == 2) {
                                try {
                                    int parseInt = Integer.parseInt((String) k.get(0));
                                    if (parseInt != 1) {
                                        throw new jsn("Unsupported serializer version found: " + parseInt);
                                    }
                                    string = (String) k.get(1);
                                    i = parseInt;
                                } catch (NumberFormatException e2) {
                                    throw new jsn("Failed to parse version number: ".concat(String.valueOf(obj2)), e2);
                                }
                            } else {
                                throw new jsn("Invalid serialized pack list: ".concat(String.valueOf(string)));
                            }
                            List<String> k2 = jut.a.k(string);
                            llk e3 = llp.e();
                            for (String str2 : k2) {
                                if (i == 0) {
                                    c2 = jss.c(jsr.e(str2), i2);
                                } else if (i != 1) {
                                    throw new IllegalStateException("Found invalid serializer version: " + i);
                                } else {
                                    List k3 = jss.a.k(str2);
                                    if (k3.size() == 2) {
                                        try {
                                            c2 = jss.c(jsr.e((String) k3.get(0)), Integer.parseInt((String) k3.get(1)));
                                        } catch (NumberFormatException e4) {
                                            throw new jsn("Failed to parse version number: ".concat(String.valueOf(obj)), e4);
                                        }
                                    } else {
                                        throw new jsn("Invalid input: ".concat(String.valueOf(str2)));
                                    }
                                }
                                e3.h(c2);
                            }
                            jve jveVar = new jve(str, e3.g(), bArr);
                            query.close();
                            return jveVar;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        cursor = query;
                        jum jumVar = this.a;
                        IOException iOException = new IOException("SqliteSelectedPacks#get, SQL query failed, superpackName: " + str, e);
                        jumVar.a(iOException);
                        throw iOException;
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.jvf
    public final Collection b() {
        try {
            return jtq.u(this.a.getReadableDatabase(), "selected_packs", e, jky.m);
        } catch (SQLiteException e2) {
            jum jumVar = this.a;
            IOException iOException = new IOException("SqliteSelectedPacks#getAll, SQL query failed", e2);
            jumVar.a(iOException);
            throw iOException;
        }
    }

    @Override // defpackage.jvf
    public final List c(String str) {
        jve a = a(str, false);
        return a == null ? llp.q() : a.a;
    }
}
