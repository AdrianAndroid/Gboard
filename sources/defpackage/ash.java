package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* compiled from: PG */
/* renamed from: ash  reason: default package */
/* loaded from: classes.dex */
public final class ash {
    private static final ThreadLocal b = new asd();
    private static final ThreadLocal c = new ase();
    private static final ThreadLocal d = new asf();
    public static final ThreadLocal a = new asg();
    private static final float e = (float) (Math.sqrt(2.0d) / 2.0d);
    private static float f = -1.0f;

    public static float a() {
        float f2 = f;
        if (f2 == -1.0f) {
            float f3 = Resources.getSystem().getDisplayMetrics().density;
            f = f3;
            return f3;
        }
        return f2;
    }

    public static float b(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float c(Matrix matrix) {
        float[] fArr = (float[]) a.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static int d(float f2, float f3, float f4, float f5) {
        int i = f2 != 0.0f ? (int) (f2 * 527.0f) : 17;
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (f4 != 0.0f) {
            i = (int) (i * 31 * f4);
        }
        return f5 != 0.0f ? (int) (i * 31 * f5) : i;
    }

    public static Bitmap e(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static Path f(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void g(Path path, aob aobVar) {
        if (aobVar == null || aobVar.a) {
            return;
        }
        h(path, ((aoj) aobVar.b).k() / 100.0f, ((aoj) aobVar.c).k() / 100.0f, ((aoj) aobVar.d).k() / 360.0f);
    }

    public static void h(Path path, float f2, float f3, float f4) {
        PathMeasure pathMeasure = (PathMeasure) b.get();
        Path path2 = (Path) c.get();
        Path path3 = (Path) d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 != 1.0f || f3 != 0.0f) {
            if (length < 1.0f || Math.abs((f3 - f2) - 1.0f) < 0.01d) {
                ami.a();
                return;
            }
            float f5 = f2 * length;
            float f6 = f3 * length;
            float f7 = f4 * length;
            float min = Math.min(f5, f6) + f7;
            float max = Math.max(f5, f6) + f7;
            if (min >= length && max >= length) {
                min = asc.d(min, length);
                max = asc.d(max, length);
            }
            if (min < 0.0f) {
                min = asc.d(min, length);
            }
            if (max < 0.0f) {
                max = asc.d(max, length);
            }
            if (min == max) {
                path.reset();
                ami.a();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            ami.a();
            return;
        }
        ami.a();
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean j(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static boolean k(int i, int i2, int i3) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        return i2 > 4 || i3 >= 0;
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint) {
        canvas.saveLayer(rectF, paint);
        ami.a();
    }
}
