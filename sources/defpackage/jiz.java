package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.system.Os;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.inputmethod.widgets.CopyImageSourceView;
import com.google.android.libraries.inputmethod.widgets.CopyImageView;
import com.google.android.libraries.stickers.megamode.MegamodeActivity;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jiz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jiz implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jiz(BroadcastReceiver.PendingResult pendingResult, int i) {
        this.b = i;
        this.a = pendingResult;
    }

    public /* synthetic */ jiz(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ jiz(CopyImageView copyImageView, int i) {
        this.b = i;
        this.a = copyImageView;
    }

    public /* synthetic */ jiz(MegamodeActivity megamodeActivity, int i) {
        this.b = i;
        this.a = megamodeActivity;
    }

    public /* synthetic */ jiz(FileDescriptor fileDescriptor, int i) {
        this.b = i;
        this.a = fileDescriptor;
    }

    public /* synthetic */ jiz(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ jiz(jjb jjbVar, int i) {
        this.b = i;
        this.a = jjbVar;
    }

    public /* synthetic */ jiz(jqx jqxVar, int i) {
        this.b = i;
        this.a = jqxVar;
    }

    public /* synthetic */ jiz(jwr jwrVar, int i) {
        this.b = i;
        this.a = jwrVar;
    }

    public /* synthetic */ jiz(kbe kbeVar, int i) {
        this.b = i;
        this.a = kbeVar;
    }

    public /* synthetic */ jiz(kof kofVar, int i) {
        this.b = i;
        this.a = kofVar;
    }

    public /* synthetic */ jiz(kql kqlVar, int i) {
        this.b = i;
        this.a = kqlVar;
    }

    public /* synthetic */ jiz(kqq kqqVar, int i) {
        this.b = i;
        this.a = kqqVar;
    }

    public /* synthetic */ jiz(moe moeVar, int i) {
        this.b = i;
        this.a = moeVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long currentTimeMillis;
        long currentTimeMillis2;
        int t;
        long currentTimeMillis3;
        switch (this.b) {
            case 0:
                jjb jjbVar = (jjb) this.a;
                if (!jjbVar.b.e()) {
                    jmk.b("%s: Called schedulePeriodicTasksInternal when taskScheduler is not provided.", "MobileDataDownload");
                    return null;
                }
                hzi hziVar = (hzi) jjbVar.b.a();
                hziVar.b("MDD.CHARGING.PERIODIC.TASK", 21600L, 3);
                hziVar.b("MDD.MAINTENANCE.PERIODIC.GCM.TASK", 86400L, 3);
                hziVar.b("MDD.CELLULAR.CHARGING.PERIODIC.TASK", 21600L, 1);
                hziVar.b("MDD.WIFI.CHARGING.PERIODIC.TASK", 21600L, 2);
                return null;
            case 1:
                Object obj = this.a;
                CopyImageView copyImageView = (CopyImageView) obj;
                Bitmap bitmap = copyImageView.a;
                if (bitmap == null || bitmap.getWidth() != copyImageView.getWidth() || copyImageView.a.getHeight() != copyImageView.getHeight()) {
                    copyImageView.a = Bitmap.createBitmap(copyImageView.getWidth(), copyImageView.getHeight(), Bitmap.Config.ARGB_8888);
                    if (copyImageView.g != null) {
                        copyImageView.h = Bitmap.createBitmap(copyImageView.getWidth(), copyImageView.getHeight(), Bitmap.Config.ALPHA_8);
                    }
                }
                Canvas canvas = new Canvas(copyImageView.a);
                View view = (View) obj;
                jdy.c(copyImageView.e, view.getRootView(), view);
                canvas.setMatrix(copyImageView.e);
                copyImageView.b = (CopyImageSourceView) view.getRootView().findViewById(copyImageView.d);
                copyImageView.b.invalidate();
                copyImageView.b.a = new jyw(copyImageView, canvas);
                view.getRootView().draw(canvas);
                Drawable drawable = copyImageView.g;
                if (drawable != null) {
                    drawable.setBounds(0, 0, copyImageView.getWidth(), copyImageView.getHeight());
                    copyImageView.g.draw(new Canvas(copyImageView.h));
                    copyImageView.i.setShader(new BitmapShader(copyImageView.a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
                }
                copyImageView.invalidate();
                return null;
            case 2:
                Object obj2 = this.a;
                ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/Superpacks", "lambda$collectGarbage$24", 1276, "Superpacks.java")).t("Starting garbage collection");
                jsf.a("gc").a("gc", "gc", new Object[0]);
                jqx jqxVar = (jqx) obj2;
                jqxVar.j();
                jvr jvrVar = jqxVar.f;
                jtf jtfVar = jvrVar.f;
                long currentTimeMillis4 = System.currentTimeMillis();
                synchronized (jvrVar.b) {
                    jtf jtfVar2 = jvrVar.f;
                    jvrVar.m = System.currentTimeMillis();
                    jtf jtfVar3 = jvrVar.f;
                    currentTimeMillis = System.currentTimeMillis();
                    LinkedList linkedList = new LinkedList();
                    jru jruVar = jvrVar.g;
                    for (File file : jru.e(jvrVar.h)) {
                        linkedList.addAll(jvrVar.l(file.getName(), jvrVar.l, false));
                    }
                    jtf jtfVar4 = jvrVar.f;
                    currentTimeMillis2 = System.currentTimeMillis();
                    t = jvrVar.t(linkedList, jxz.EXPLICIT_GC);
                    jtf jtfVar5 = jvrVar.f;
                    currentTimeMillis3 = System.currentTimeMillis();
                }
                lwm.r(null, jvrVar.l, jxz.EXPLICIT_GC, currentTimeMillis3 - currentTimeMillis4, currentTimeMillis - currentTimeMillis4, currentTimeMillis2 - currentTimeMillis, currentTimeMillis3 - currentTimeMillis2);
                if (t > 0) {
                    ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/Superpacks", "lambda$collectGarbage$24", 1282, "Superpacks.java")).u("GC deleted %d files", t);
                }
                jsf.a("gc").b("gc", "gce", Integer.valueOf(t));
                return null;
            case 3:
                Object obj3 = this.a;
                synchronized (((jwr) obj3).i) {
                    jwr jwrVar = (jwr) ((jwr) obj3).i.c.remove(((jwr) obj3).b.o());
                    if (jwrVar != null) {
                        jwrVar.close();
                    }
                }
                synchronized (obj3) {
                    mld mldVar = ((jwr) obj3).g;
                    if (mldVar != null) {
                        mldVar.c(null);
                    }
                }
                return kcu.K(null);
            case 4:
                ((kbe) this.a).a();
                return null;
            case 5:
                ((kbe) this.a).a();
                return null;
            case 6:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return null;
            case 7:
                return uv.f((Context) this.a);
            case 8:
                return uq.a((Context) this.a);
            case 9:
                return Os.lstat((String) this.a);
            case 10:
                return Os.fstat((FileDescriptor) this.a);
            case 11:
                File file2 = new File(((Context) this.a).getCacheDir(), "expressivestickers/share");
                if (!file2.exists() && !file2.mkdirs()) {
                    throw new IllegalStateException("Unable to create destination directory.");
                }
                return file2;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                kof kofVar = (kof) this.a;
                File b = kofVar.b();
                if (!b.exists()) {
                    knn knnVar = (knn) kofVar.a;
                    nfh h = knnVar.h(kofVar.c, kofVar.d, kofVar.f);
                    new ArrayList();
                    knnVar.g();
                    if (h.c) {
                        h.cD();
                        h.c = false;
                    }
                    ndc ndcVar = ndc.h;
                    ((ndc) h.b).g = nfm.G();
                    if (h.c) {
                        h.cD();
                        h.c = false;
                    }
                    ((ndc) h.b).c = nfm.G();
                    File file3 = new File(kofVar.a.e(), kfl.f(Long.toString(Arrays.hashCode(((ndc) h.cz()).q()))));
                    if (file3.exists() && !b.exists()) {
                        try {
                            if (file3.renameTo(b)) {
                                file3 = b;
                            } else {
                                Log.w("MetadataFetcher", "Failed to renamed the old cache file.");
                            }
                        } catch (Exception e) {
                            Log.w("MetadataFetcher", "Failed to renamed the old cache file.", e);
                        }
                    }
                    if (file3.exists()) {
                        b = file3;
                    }
                }
                try {
                    nfh t2 = ncs.b.t();
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(b), 32768);
                    ner H = ner.H(gZIPInputStream);
                    t2.ct(H, nfb.a());
                    H.z(0);
                    gZIPInputStream.close();
                    return (ncs) t2.cz();
                } catch (FileNotFoundException e2) {
                    b.getName();
                    throw e2;
                } catch (IOException e3) {
                    Log.w("MetadataFetcher", "Unexpected error reading cached file ".concat(String.valueOf(b.getName())), e3);
                    throw e3;
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                kql kqlVar = (kql) this.a;
                kqlVar.c = kqlVar.a.getSharedPreferences(kqlVar.b, 0);
                return Boolean.valueOf(!kqlVar.c.getAll().isEmpty());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                kql kqlVar2 = (kql) this.a;
                Set<String> keySet = kqlVar2.c.getAll().keySet();
                SharedPreferences.Editor edit = kqlVar2.c.edit();
                for (String str : keySet) {
                    edit.remove(str);
                }
                if (!edit.commit()) {
                    throw new IOException("Failed to remove migrated SharedPreferences keys: ".concat(String.valueOf(kqlVar2.b)));
                }
                return null;
            case 15:
                Object obj4 = this.a;
                synchronized (((kqq) obj4).b.d) {
                    ((kqq) obj4).a = null;
                }
                return null;
            default:
                Object obj5 = this.a;
                synchronized (obj5) {
                    ((mok) ((moe) obj5).a.a()).b(System.currentTimeMillis(), ((moo) ((moe) obj5).b.a()).a());
                }
                return null;
        }
    }
}
