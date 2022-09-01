package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* renamed from: fty  reason: default package */
/* loaded from: classes.dex */
public final class fty {
    private static Boolean d = null;
    private static String e = null;
    private static boolean f = false;
    private static int g = -1;
    private static Boolean h;
    private static ftz l;
    private static fua m;
    public final Context c;
    private static final ThreadLocal i = new ThreadLocal();
    private static final ThreadLocal j = new ftq();
    private static final ftv k = new ftr();
    public static final ftx a = new fts(1);
    public static final ftx b = new fts(0);

    private fty(Context context) {
        fyb.ax(context);
        this.c = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!fyb.aJ(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, android.database.Cursor] */
    public static int b(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int readInt;
        ftm ftkVar;
        ?? r1;
        try {
            synchronized (fty.class) {
                Boolean bool = d;
                Cursor cursor = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e3.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (ftu unused) {
                            }
                            bool = Boolean.TRUE;
                        } else if (!i(context)) {
                            return 0;
                        } else {
                            if (f || Boolean.TRUE.equals(null)) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int e4 = e(context, str, z, true);
                                    String str2 = e;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader a2 = fto.a();
                                        if (a2 == null) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = e;
                                                fyb.ax(str3);
                                                a2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = e;
                                                fyb.ax(str4);
                                                a2 = new ftp(str4, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        g(a2);
                                        declaredField.set(null, a2);
                                        d = Boolean.TRUE;
                                        return e4;
                                    }
                                    return e4;
                                } catch (ftu unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                        }
                        d = bool;
                    }
                }
                if (!bool.booleanValue()) {
                    ftz j2 = j(context);
                    try {
                        if (j2 == null) {
                            return 0;
                        }
                        try {
                            int e5 = j2.e();
                            if (e5 >= 3) {
                                oir oirVar = (oir) i.get();
                                if (oirVar == null || (r1 = oirVar.a) == 0) {
                                    ftm b2 = ftl.b(context);
                                    long longValue = ((Long) j.get()).longValue();
                                    Parcel a3 = j2.a();
                                    bkh.f(a3, b2);
                                    a3.writeString(str);
                                    bkh.c(a3, z);
                                    a3.writeLong(longValue);
                                    Parcel hG = j2.hG(7, a3);
                                    IBinder readStrongBinder = hG.readStrongBinder();
                                    if (readStrongBinder == null) {
                                        ftkVar = null;
                                    } else {
                                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        ftkVar = queryLocalInterface instanceof ftm ? (ftm) queryLocalInterface : new ftk(readStrongBinder);
                                    }
                                    hG.recycle();
                                    Cursor cursor2 = (Cursor) ftl.c(ftkVar);
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                readInt = cursor2.getInt(0);
                                                if (readInt <= 0 || !h(cursor2)) {
                                                    cursor = cursor2;
                                                }
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                            }
                                        } catch (RemoteException e6) {
                                            e2 = e6;
                                            cursor = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                            if (cursor == null) {
                                                return 0;
                                            }
                                            cursor.close();
                                            return 0;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursor2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                }
                                return r1.getInt(0);
                            } else if (e5 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                ftm b3 = ftl.b(context);
                                Parcel a4 = j2.a();
                                bkh.f(a4, b3);
                                a4.writeString(str);
                                bkh.c(a4, z);
                                Parcel hG2 = j2.hG(5, a4);
                                readInt = hG2.readInt();
                                hG2.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                ftm b4 = ftl.b(context);
                                Parcel a5 = j2.a();
                                bkh.f(a5, b4);
                                a5.writeString(str);
                                bkh.c(a5, z);
                                Parcel hG3 = j2.hG(3, a5);
                                readInt = hG3.readInt();
                                hG3.recycle();
                            }
                            return readInt;
                        } catch (RemoteException e7) {
                            e2 = e7;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    try {
                        return e(context, str, z, false);
                    } catch (ftu e8) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e8.getMessage());
                        return 0;
                    }
                }
            }
        } catch (Throwable th4) {
            fyb.y(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, android.database.Cursor] */
    public static fty c(Context context, ftx ftxVar, String str) {
        Boolean bool;
        fty ftyVar;
        fua fuaVar;
        Boolean valueOf;
        ThreadLocal threadLocal = i;
        oir oirVar = (oir) threadLocal.get();
        oir oirVar2 = new oir();
        threadLocal.set(oirVar2);
        ThreadLocal threadLocal2 = j;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            ftw a2 = ftxVar.a(context, str, k);
            int i2 = a2.a;
            int i3 = a2.b;
            Log.i("DynamiteModule", "Considering local module " + str + ":" + i2 + " and remote module " + str + ":" + i3);
            int i4 = a2.c;
            if (i4 == 0 || ((i4 == -1 && a2.a == 0) || (i4 == 1 && a2.b == 0))) {
                int i5 = a2.a;
                int i6 = a2.b;
                throw new ftu("No acceptable module " + str + " found. Local version is " + i5 + " and remote version is " + i6 + ".");
            } else if (i4 == -1) {
                fty f2 = f(context, str);
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(longValue));
                }
                ?? r2 = oirVar2.a;
                if (r2 != 0) {
                    r2.close();
                }
                threadLocal.set(oirVar);
                return f2;
            } else if (i4 != 1) {
                throw new ftu("VersionPolicy returned invalid code:0");
            } else {
                try {
                    int i7 = a2.b;
                    try {
                        synchronized (fty.class) {
                            if (!i(context)) {
                                throw new ftu("Remote loading disabled");
                            }
                            bool = d;
                        }
                        if (bool == null) {
                            throw new ftu("Failed to determine which loading route to use.");
                        }
                        boolean booleanValue = bool.booleanValue();
                        ftm ftmVar = null;
                        if (booleanValue) {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i7);
                            synchronized (fty.class) {
                                fuaVar = m;
                            }
                            if (fuaVar == null) {
                                throw new ftu("DynamiteLoaderV2 was not cached.");
                            }
                            oir oirVar3 = (oir) threadLocal.get();
                            if (oirVar3 == null || oirVar3.a == null) {
                                throw new ftu("No result cursor");
                            }
                            Context applicationContext = context.getApplicationContext();
                            Object obj = oirVar3.a;
                            ftl.b(null);
                            synchronized (fty.class) {
                                valueOf = Boolean.valueOf(g >= 2);
                            }
                            if (valueOf.booleanValue()) {
                                ftm b2 = ftl.b(applicationContext);
                                ftm b3 = ftl.b(obj);
                                Parcel a3 = fuaVar.a();
                                bkh.f(a3, b2);
                                a3.writeString(str);
                                a3.writeInt(i7);
                                bkh.f(a3, b3);
                                Parcel hG = fuaVar.hG(3, a3);
                                IBinder readStrongBinder = hG.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    ftmVar = queryLocalInterface instanceof ftm ? (ftm) queryLocalInterface : new ftk(readStrongBinder);
                                }
                                hG.recycle();
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                ftm b4 = ftl.b(applicationContext);
                                ftm b5 = ftl.b(obj);
                                Parcel a4 = fuaVar.a();
                                bkh.f(a4, b4);
                                a4.writeString(str);
                                a4.writeInt(i7);
                                bkh.f(a4, b5);
                                Parcel hG2 = fuaVar.hG(2, a4);
                                IBinder readStrongBinder2 = hG2.readStrongBinder();
                                if (readStrongBinder2 != null) {
                                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    ftmVar = queryLocalInterface2 instanceof ftm ? (ftm) queryLocalInterface2 : new ftk(readStrongBinder2);
                                }
                                hG2.recycle();
                            }
                            Context context2 = (Context) ftl.c(ftmVar);
                            if (context2 == null) {
                                throw new ftu("Failed to get module context");
                            }
                            ftyVar = new fty(context2);
                        } else {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i7);
                            ftz j2 = j(context);
                            if (j2 == null) {
                                throw new ftu("Failed to create IDynamiteLoader.");
                            }
                            int e2 = j2.e();
                            if (e2 >= 3) {
                                oir oirVar4 = (oir) threadLocal.get();
                                if (oirVar4 == null) {
                                    throw new ftu("No cached result cursor holder");
                                }
                                ftm b6 = ftl.b(context);
                                ftm b7 = ftl.b(oirVar4.a);
                                Parcel a5 = j2.a();
                                bkh.f(a5, b6);
                                a5.writeString(str);
                                a5.writeInt(i7);
                                bkh.f(a5, b7);
                                Parcel hG3 = j2.hG(8, a5);
                                IBinder readStrongBinder3 = hG3.readStrongBinder();
                                if (readStrongBinder3 != null) {
                                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    ftmVar = queryLocalInterface3 instanceof ftm ? (ftm) queryLocalInterface3 : new ftk(readStrongBinder3);
                                }
                                hG3.recycle();
                            } else if (e2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                ftm b8 = ftl.b(context);
                                Parcel a6 = j2.a();
                                bkh.f(a6, b8);
                                a6.writeString(str);
                                a6.writeInt(i7);
                                Parcel hG4 = j2.hG(4, a6);
                                IBinder readStrongBinder4 = hG4.readStrongBinder();
                                if (readStrongBinder4 != null) {
                                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    ftmVar = queryLocalInterface4 instanceof ftm ? (ftm) queryLocalInterface4 : new ftk(readStrongBinder4);
                                }
                                hG4.recycle();
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                ftm b9 = ftl.b(context);
                                Parcel a7 = j2.a();
                                bkh.f(a7, b9);
                                a7.writeString(str);
                                a7.writeInt(i7);
                                Parcel hG5 = j2.hG(2, a7);
                                IBinder readStrongBinder5 = hG5.readStrongBinder();
                                if (readStrongBinder5 != null) {
                                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    ftmVar = queryLocalInterface5 instanceof ftm ? (ftm) queryLocalInterface5 : new ftk(readStrongBinder5);
                                }
                                hG5.recycle();
                            }
                            Object c = ftl.c(ftmVar);
                            if (c == null) {
                                throw new ftu("Failed to load remote module.");
                            }
                            ftyVar = new fty((Context) c);
                        }
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        ?? r1 = oirVar2.a;
                        if (r1 != 0) {
                            r1.close();
                        }
                        threadLocal.set(oirVar);
                        return ftyVar;
                    } catch (RemoteException e3) {
                        throw new ftu("Failed to load remote module.", e3);
                    } catch (ftu e4) {
                        throw e4;
                    } catch (Throwable th) {
                        fyb.y(context, th);
                        throw new ftu("Failed to load remote module.", th);
                    }
                } catch (ftu e5) {
                    String message = e5.getMessage();
                    Log.w("DynamiteModule", "Failed to load remote module: " + message);
                    int i8 = a2.a;
                    if (i8 == 0 || ftxVar.a(context, str, new ftt(i8)).c != -1) {
                        throw new ftu("Remote load failed. No local fallback found.", e5);
                    }
                    fty f3 = f(context, str);
                    if (longValue == 0) {
                        j.remove();
                    } else {
                        j.set(Long.valueOf(longValue));
                    }
                    ?? r22 = oirVar2.a;
                    if (r22 != 0) {
                        r22.close();
                    }
                    i.set(oirVar);
                    return f3;
                }
            }
        } catch (Throwable th2) {
            if (longValue == 0) {
                j.remove();
            } else {
                j.set(Long.valueOf(longValue));
            }
            ?? r23 = oirVar2.a;
            if (r23 != 0) {
                r23.close();
            }
            i.set(oirVar);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
        if (h(r10) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int e(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = defpackage.fty.j     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r12.<init>()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            if (r10 == 0) goto La5
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            if (r11 == 0) goto La5
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            if (r12 <= 0) goto L8d
            java.lang.Class<fty> r1 = defpackage.fty.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8a
            defpackage.fty.e = r2     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8a
            defpackage.fty.g = r2     // Catch: java.lang.Throwable -> L8a
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = 0
        L7f:
            defpackage.fty.f = r9     // Catch: java.lang.Throwable -> L8a
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            boolean r1 = h(r10)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            if (r1 == 0) goto L8d
            goto L8e
        L8a:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r11     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
        L8d:
            r0 = r10
        L8e:
            if (r13 == 0) goto L9f
            if (r11 != 0) goto L93
            goto L9f
        L93:
            ftu r10 = new ftu     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            throw r10     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
        L9b:
            r10 = move-exception
            goto Lc9
        L9d:
            r10 = move-exception
            goto Lbb
        L9f:
            if (r0 == 0) goto La4
            r0.close()
        La4:
            return r12
        La5:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            ftu r11 = new ftu     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            throw r11     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
        Lb4:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto Lc9
        Lb8:
            r11 = move-exception
            r0 = r10
            r10 = r11
        Lbb:
            boolean r11 = r10 instanceof defpackage.ftu     // Catch: java.lang.Throwable -> L9b
            if (r11 == 0) goto Lc1
            throw r10     // Catch: java.lang.Throwable -> L9b
        Lc1:
            ftu r11 = new ftu     // Catch: java.lang.Throwable -> L9b
            java.lang.String r12 = "V2 version check failed"
            r11.<init>(r12, r10)     // Catch: java.lang.Throwable -> L9b
            throw r11     // Catch: java.lang.Throwable -> L9b
        Lc9:
            if (r0 == 0) goto Lce
            r0.close()
        Lce:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fty.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static fty f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new fty(context.getApplicationContext());
    }

    private static void g(ClassLoader classLoader) {
        fua fuaVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                fuaVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof fua) {
                    fuaVar = (fua) queryLocalInterface;
                } else {
                    fuaVar = new fua(iBinder);
                }
            }
            m = fuaVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new ftu("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean h(Cursor cursor) {
        oir oirVar = (oir) i.get();
        if (oirVar == null || oirVar.a != null) {
            return false;
        }
        oirVar.a = cursor;
        return true;
    }

    private static boolean i(Context context) {
        if (!Boolean.TRUE.equals(null) && !Boolean.TRUE.equals(h)) {
            boolean z = false;
            if (h == null) {
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
                if (fmy.d.f(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                h = valueOf;
                z = valueOf.booleanValue();
                if (z && resolveContentProvider != null && resolveContentProvider.applicationInfo != null && (resolveContentProvider.applicationInfo.flags & 129) == 0) {
                    Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                    f = true;
                }
            }
            if (!z) {
                Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
            }
            return z;
        }
        return true;
    }

    private static ftz j(Context context) {
        ftz ftzVar;
        synchronized (fty.class) {
            ftz ftzVar2 = l;
            if (ftzVar2 != null) {
                return ftzVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    ftzVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    ftzVar = queryLocalInterface instanceof ftz ? (ftz) queryLocalInterface : new ftz(iBinder);
                }
                if (ftzVar != null) {
                    l = ftzVar;
                    return ftzVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder d() {
        try {
            return (IBinder) this.c.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new ftu("Failed to instantiate module class: com.google.android.gms.common.GoogleCertificatesImpl", e2);
        }
    }
}
