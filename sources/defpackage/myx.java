package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: myx  reason: default package */
/* loaded from: classes2.dex */
public final class myx implements fwh {
    public final fwh a;
    public final myr b;
    public final mzb c;
    public volatile Deque d = null;
    private final Executor e;

    public myx(Context context, Executor executor, myr myrVar, fwh fwhVar) {
        this.e = kcu.E(executor);
        mys mysVar = myrVar.a;
        myq myqVar = (mysVar == null ? mys.d : mysVar).b;
        this.c = new mzb(context, myqVar == null ? myq.b : myqVar);
        this.b = myrVar;
        this.a = fwhVar;
    }

    @Override // defpackage.fwh
    public final void b(final fwg fwgVar) {
        this.e.execute(new Runnable() { // from class: myv
            @Override // java.lang.Runnable
            public final void run() {
                oxo oxoVar;
                oxt oxtVar;
                oxs oxsVar;
                oxn oxnVar;
                myx myxVar = myx.this;
                fwg fwgVar2 = fwgVar;
                if (myxVar.d == null) {
                    while (true) {
                        try {
                            mld e = mld.e();
                            myxVar.a.b(new myw(e));
                            try {
                                lfb lfbVar = (lfb) e.get();
                                if (!lfbVar.e()) {
                                    mzb mzbVar = myxVar.c;
                                    mys mysVar = myxVar.b.a;
                                    if (mysVar == null) {
                                        mysVar = mys.d;
                                    }
                                    Cursor rawQuery = mzbVar.a.getReadableDatabase().rawQuery(mysVar.c, null);
                                    try {
                                        ArrayDeque arrayDeque = new ArrayDeque(rawQuery.getCount());
                                        while (rawQuery.moveToNext()) {
                                            nfh t = oxr.b.t();
                                            for (int i = 0; i < rawQuery.getColumnCount(); i++) {
                                                nfh t2 = oxp.c.t();
                                                int type = rawQuery.getType(i);
                                                if (type == 1) {
                                                    nfh t3 = oxt.b.t();
                                                    t3.eS(rawQuery.getLong(i));
                                                    oxt oxtVar2 = (oxt) t3.cz();
                                                    if (t2.c) {
                                                        t2.cD();
                                                        t2.c = false;
                                                    }
                                                    oxp oxpVar = (oxp) t2.b;
                                                    oxtVar2.getClass();
                                                    oxpVar.b = oxtVar2;
                                                    oxpVar.a = 3;
                                                } else if (type == 2) {
                                                    nfh t4 = oxs.b.t();
                                                    t4.eR(rawQuery.getFloat(i));
                                                    oxs oxsVar2 = (oxs) t4.cz();
                                                    if (t2.c) {
                                                        t2.cD();
                                                        t2.c = false;
                                                    }
                                                    oxp oxpVar2 = (oxp) t2.b;
                                                    oxsVar2.getClass();
                                                    oxpVar2.b = oxsVar2;
                                                    oxpVar2.a = 2;
                                                } else {
                                                    throw new UnsupportedOperationException(String.format("Unsupported column type for column `%s`: %d", rawQuery.getColumnName(i), Integer.valueOf(rawQuery.getType(i))));
                                                }
                                                t.eQ(rawQuery.getColumnName(i), (oxp) t2.cz());
                                            }
                                            nfh t5 = oxo.b.t();
                                            oxr oxrVar = (oxr) t.cz();
                                            if (t5.c) {
                                                t5.cD();
                                                t5.c = false;
                                            }
                                            oxrVar.getClass();
                                            ((oxo) t5.b).a = oxrVar;
                                            arrayDeque.add((oxo) t5.cz());
                                        }
                                        if (rawQuery != null) {
                                            rawQuery.close();
                                        }
                                        myxVar.d = arrayDeque;
                                        nfh t6 = oxo.b.t();
                                        nfh t7 = oxr.b.t();
                                        nfh t8 = oxp.c.t();
                                        nfh t9 = oxt.b.t();
                                        t9.eS(1L);
                                        if (t8.c) {
                                            t8.cD();
                                            t8.c = false;
                                        }
                                        oxp oxpVar3 = (oxp) t8.b;
                                        oxt oxtVar3 = (oxt) t9.cz();
                                        oxtVar3.getClass();
                                        oxpVar3.b = oxtVar3;
                                        oxpVar3.a = 3;
                                        t7.eQ("client_sql_version", (oxp) t8.cz());
                                        oxr oxrVar2 = (oxr) t7.cz();
                                        if (t6.c) {
                                            t6.cD();
                                            t6.c = false;
                                        }
                                        oxrVar2.getClass();
                                        ((oxo) t6.b).a = oxrVar2;
                                        oxoVar = (oxo) t6.cz();
                                    } catch (Throwable th) {
                                        if (rawQuery != null) {
                                            try {
                                                rawQuery.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        throw th;
                                    }
                                } else {
                                    mzb mzbVar2 = myxVar.c;
                                    nfb a = nfb.a();
                                    oxo oxoVar2 = oxo.b;
                                    ContentValues contentValues = new ContentValues();
                                    oxr oxrVar3 = ((oxo) nfm.z(oxoVar2, (byte[]) lfbVar.a(), a)).a;
                                    if (oxrVar3 == null) {
                                        oxrVar3 = oxr.b;
                                    }
                                    for (Map.Entry entry : Collections.unmodifiableMap(oxrVar3.a).entrySet()) {
                                        String str = (String) entry.getKey();
                                        if (mzbVar2.c.contains(str)) {
                                            oxp oxpVar4 = (oxp) entry.getValue();
                                            jdg.A(!contentValues.containsKey(str), "Column name `%s` already present in the specified contentValues.", str);
                                            int i2 = oxpVar4.a;
                                            int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 3 : 2 : 1 : 4;
                                            int i4 = i3 - 1;
                                            if (i3 == 0) {
                                                throw null;
                                            }
                                            if (i4 == 0) {
                                                if (i2 == 1) {
                                                    oxnVar = (oxn) oxpVar4.b;
                                                } else {
                                                    oxnVar = oxn.b;
                                                }
                                                jdg.y(oxnVar.a.size() == 1, "Expected %s to be scalar, but bytes_list.value count was: %d", oxnVar.a.size());
                                                contentValues.put(str, ((nem) oxnVar.a.get(0)).D());
                                            } else if (i4 == 1) {
                                                if (i2 == 2) {
                                                    oxsVar = (oxs) oxpVar4.b;
                                                } else {
                                                    oxsVar = oxs.b;
                                                }
                                                jdg.y(oxsVar.a.size() == 1, "Expected %s to be scalar, but float_list.value count was: %d", oxsVar.a.size());
                                                contentValues.put(str, Float.valueOf(oxsVar.a.d(0)));
                                            } else if (i4 == 2) {
                                                if (i2 == 3) {
                                                    oxtVar = (oxt) oxpVar4.b;
                                                } else {
                                                    oxtVar = oxt.b;
                                                }
                                                jdg.y(oxtVar.a.size() == 1, "Expected %s to be scalar, but int64_list.value count was: %d", oxtVar.a.size());
                                                contentValues.put(str, Long.valueOf(oxtVar.a.a(0)));
                                            } else {
                                                throw new AssertionError();
                                            }
                                        }
                                    }
                                    contentValues.put(mzbVar2.b.c, "Outis");
                                    mzbVar2.a.getWritableDatabase().insertOrThrow(mzbVar2.b.a, null, contentValues);
                                }
                            } catch (ExecutionException e2) {
                                myy myyVar = (myy) Objects.requireNonNull(e2.getCause());
                                throw new myy(myyVar.a, myyVar.getMessage(), e2);
                            }
                        } catch (InterruptedException e3) {
                            e = e3;
                            fwgVar2.a(8, e.getMessage());
                            return;
                        } catch (myy e4) {
                            fwgVar2.a(e4.a, e4.getMessage());
                            return;
                        } catch (ngd e5) {
                            e = e5;
                            fwgVar2.a(8, e.getMessage());
                            return;
                        }
                    }
                } else {
                    oxoVar = (oxo) myxVar.d.pollFirst();
                }
                fwgVar2.b(oxoVar == null ? null : oxoVar.q(), null);
            }
        });
    }

    @Override // defpackage.fwh
    public final void c(int i) {
    }

    @Override // defpackage.fwh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.execute(new kvl(this, 14));
    }
}
