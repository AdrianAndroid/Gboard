package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jsf  reason: default package */
/* loaded from: classes.dex */
public final class jsf implements jtb {
    public jzr b;
    private File e;
    private boolean f;
    private final Set g = new HashSet();
    private static final jrz c = new jsd();
    public static final jsf a = new jsf();

    public static jrz a(String str) {
        return a.d(str);
    }

    private final synchronized jrz d(String str) {
        return (!f() || (!this.g.isEmpty() && !this.g.contains(str))) ? c : new jse(this, str);
    }

    private final synchronized boolean f() {
        return this.b != null;
    }

    public final synchronized String b(long j) {
        Object obj;
        String obj2;
        jzr jzrVar = this.b;
        if (jzrVar == null) {
            throw new IllegalStateException("Tracer is not enabled");
        }
        nzv nzvVar = jsc.a;
        jzt a2 = jzu.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        lyu a3 = lyu.a();
        StringWriter stringWriter = new StringWriter();
        a3.d(stringWriter);
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        a3.d(jsonWriter);
        nzvVar.a = jsonWriter;
        Object obj3 = nzvVar.a;
        if (obj3 != null && (obj = nzvVar.c) != null) {
            jzp jzpVar = new jzp((JsonWriter) obj3, (jsb) nzvVar.b, (jzn) obj);
            JsonWriter jsonWriter2 = jzpVar.b;
            jsonWriter2.beginArray();
            jzrVar.c(new jzo(jzpVar, jsonWriter2, a2, j < 0 ? j : SystemClock.elapsedRealtime() + j));
            jsonWriter2.endArray();
            a3.close();
            obj2 = stringWriter.toString();
            a2.h(SystemClock.elapsedRealtime() - elapsedRealtime);
            a2.i(obj2.length());
            a2.j(a2.a());
            a2.c();
            lug lugVar = jsh.a;
        }
        StringBuilder sb = new StringBuilder();
        if (nzvVar.a == null) {
            sb.append(" writer");
        }
        if (nzvVar.c == null) {
            sb.append(" argValueMapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        return obj2;
    }

    public final synchronized void c(Context context, String... strArr) {
        if (this.f) {
            return;
        }
        this.f = true;
        File file = new File(context.getFilesDir(), "superpacks.logs");
        this.e = file;
        try {
            jtf.b(file);
            try {
                jzr jzrVar = new jzr(new File(this.e, "traces.bin"), jgf.e);
                jzrVar.d(jry.a);
                this.b = jzrVar;
                Collections.addAll(this.g, strArr);
                Map map = jsa.a;
                jsa.a("gce", "deleted");
                jsa.a("download", "start_file_size");
                jsa.a("download_end", "end_file_size");
                jsa.a("download_failed", "end_file_size", "error");
                jsa.a("sync_succeeded", "sync_version", "changed", "new_pack_count");
                jsa.a("sync_failed", "error");
                jsa.a("register_succeeded", "old_version", "new_version");
                jsa.a("register_failed", "error");
                jsa.a("open_packs", "pack_count");
                jsa.a("deleted", "file_name", "result");
                jsa.a("scheduled", "delay_s");
            } catch (IOException e) {
                ((luc) ((luc) ((luc) jsh.a.d()).i(e)).k("com/google/android/libraries/micore/superpacks/base/HistoryTracer", "initialize", '`', "HistoryTracer.java")).t("Failed to create tracer object, logging will be disabled");
            }
        } catch (IOException e2) {
            ((luc) ((luc) ((luc) jsh.a.d()).i(e2)).k("com/google/android/libraries/micore/superpacks/base/HistoryTracer", "initialize", 'S', "HistoryTracer.java")).t("Failed to create logs dir, logging will be disabled");
        }
    }

    @Override // defpackage.jtb
    public final synchronized void e(PrintWriter printWriter, boolean z) {
        printWriter.println("## History tracer");
        boolean f = f();
        printWriter.printf("- enabled: %b\n", Boolean.valueOf(f));
        if (f) {
            Object[] objArr = new Object[1];
            objArr[0] = this.g.isEmpty() ? "all" : this.g;
            printWriter.printf("- enabled groups: %s\n", objArr);
            jzr jzrVar = this.b;
            if (jzrVar != null) {
                printWriter.printf("- stats: %s\n", jzrVar.a());
            }
        }
    }
}
