package org.jetbrains.kotlinx.multik.jni

import org.jetbrains.kotlinx.multik.ndarray.data.D1Array
import org.jetbrains.kotlinx.multik.ndarray.data.Dimension
import org.jetbrains.kotlinx.multik.ndarray.data.MultiArray
import org.jetbrains.kotlinx.multik.ndarray.data.NDArray

/**
 * Returns flat index of maximum element in an ndarray.
 */
public fun <T : Number, D : Dimension> MultiArray<T, D>.argMax(): Int = NativeMath.argMax(this)

/**
 * Returns flat index of minimum element in an ndarray.
 */
public fun <T : Number, D : Dimension> MultiArray<T, D>.argMin(): Int = NativeMath.argMin(this)

/**
 * Returns an ndarray of Double from the given ndarray to each element of which an exp function has been applied.
 */
public fun <T : Number, D : Dimension> MultiArray<T, D>.exp(): NDArray<Double, D> = NativeMath.exp(this)

/**
 * Returns an ndarray of Double from the given ndarray to each element of which a log function has been applied.
 */
public fun <T : Number, D : Dimension> MultiArray<T, D>.log(): NDArray<Double, D> = NativeMath.log(this)

/**
 * Returns an ndarray of Double from the given ndarray to each element of which a sin function has been applied.
 */
public fun <T : Number, D : Dimension> MultiArray<T, D>.sin(): NDArray<Double, D> = NativeMath.sin(this)

/**
 * Returns an ndarray of Double from the given ndarray to each element of which a cos function has been applied.
 */
public fun <T : Number, D : Dimension> MultiArray<T, D>.cos(): NDArray<Double, D> = NativeMath.cos(this)

/**
 * Returns cumulative sum of all elements in the given ndarray.
 */
public fun <T : Number, D : Dimension> MultiArray<T, D>.cumSum(): D1Array<T> = NativeMath.cumSum(this)
